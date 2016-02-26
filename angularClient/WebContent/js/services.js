/*
var raServices=angular.module('raServices',['ngResource']);  
 
raServices.factory('UsersService', ['$resource',
 
 function($resource){
 
         
 
   return $resource('http://localhost:8181/spingService/service/:call', {}, {
 
     users: {method:'GET',params:{call:'users'},isArray:true},
 
     user:{method:'GET',params:{call:'user'},isArray:false}
 
   });
 
 }]);
*/
/*
var app = angular.module('app', ['ngResource']);

scotchApp.factory('UserService', function($resource){
    return $resource('http://localhost:8181/spingService/service/users')
});

scotchApp.factory('UsersService', function($resource){
    return $resource('http://localhost:8181/spingService/service/:call', { }, {
        users: {
            method: 'GET',params:{call:'users'},isArray:true
          },
          user: {
              method: 'GET',params:{call:'user'},isArray:false
            }  
    });
});
*/

var app = angular.module('app', []);

scotchApp.constant('ENDPOINT_URI', 'http://localhost:8181/spingService/service/')
scotchApp.service('UsersService', function ($http, ENDPOINT_URI) {
  var service = this,
  path = 'users';

  function getUrl() {
    return ENDPOINT_URI + path;
  }

  function getUrlForId(userId) {
    return getUrl(path) + userId;
  }

  service.all = function () {
    return $http.get(getUrl());
  };

  service.fetch = function (userId) {
    return $http.get(getUrlForId(userId));
  };
});
