var app = angular.module('app', []);

scotchApp.constant('ENDPOINT_URI', 'http://localhost:8181/spingService/service/')
scotchApp.service('UsersService', function ($http, ENDPOINT_URI) {
  var service = this,
  pathUsers = 'users',
  pathUser = 'user'
  ;

  function getUrl() {
    return ENDPOINT_URI + pathUsers;
  }

  function getUrlForId(userId) {
    return ENDPOINT_URI + pathUser + '?id=' + userId;
  }

  service.all = function () {
    return $http.get(getUrl());
  };

  service.fetch = function (userId) {
    return $http.get(getUrlForId(userId));
  };
});
