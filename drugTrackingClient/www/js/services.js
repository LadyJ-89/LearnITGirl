angular.module('starter.services', [])

.constant('ENDPOINT_URI', 'http://localhost:8181/drugTrackingService/service/')

.service('PlansService', function ($http, ENDPOINT_URI) {
  var service = this,
  pathSigns = 'drugplans',
  pathSign = 'drugplan'
  ;

  function getUrl() {
    return ENDPOINT_URI + pathSigns;
  }

  function getUrlForId(drugPlanId) {
    return ENDPOINT_URI + pathSign + '?id=' + drugPlanId;
  }
  

  service.all = function () {
    return $http.get(getUrl());
  };

  service.fetch = function (drugPlanId) {
    return $http.get(getUrlForId(drugPlanId));
  };
})

.service('VitalSignsService', function ($http, ENDPOINT_URI) {
  var service = this,
  pathSigns = 'vitalsigns',
  pathSign = 'vitalsign'
  ;

  function getUrl() {
    return ENDPOINT_URI + pathSigns;
  }

  function getUrlForId(signId) {
    return ENDPOINT_URI + pathSign + '?id=' + signId;
  }
  
  service.all = function () {
    return $http.get(getUrl());
  };

  service.fetch = function (signId) {
    return $http.get(getUrlForId(signId));
  };
})

.service('DrugsService', function ($http, ENDPOINT_URI) {
  var service = this,
  pathDrugs = 'drugs',
  pathDrug = 'drug'
  ;

  function getUrl() {
    return ENDPOINT_URI + pathDrugs;
  }

  function getUrlForId(drugId) {
    return ENDPOINT_URI + pathDrug + '?id=' + drugId;
  }

  service.all = function () {
    return $http.get(getUrl());
  };

  service.fetch = function (drugId) {
    return $http.get(getUrlForId(drugId));
  };
})

.service('SettingsService', function ($http, ENDPOINT_URI) {
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
})

.service('UsersService', function ($http, ENDPOINT_URI) {
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
})

.factory('Chats', function() {
  // Might use a resource here that returns a JSON array

  // Some fake testing data
  var chats = [{
    id: 0,
    name: 'Ben Sparrow',
    lastText: 'You on your way?',
    face: 'img/ben.png'
  }, {
    id: 1,
    name: 'Max Lynx',
    lastText: 'Hey, it\'s me',
    face: 'img/max.png'
  }, {
    id: 2,
    name: 'Adam Bradleyson',
    lastText: 'I should buy a boat',
    face: 'img/adam.jpg'
  }, {
    id: 3,
    name: 'Perry Governor',
    lastText: 'Look at my mukluks!',
    face: 'img/perry.png'
  }, {
    id: 4,
    name: 'Mike Harrington',
    lastText: 'This is wicked good ice cream.',
    face: 'img/mike.png'
  }];

  return {
    all: function() {
      return chats;
    },
    remove: function(chat) {
      chats.splice(chats.indexOf(chat), 1);
    },
    get: function(chatId) {
      for (var i = 0; i < chats.length; i++) {
        if (chats[i].id === parseInt(chatId)) {
          return chats[i];
        }
      }
      return null;
    }
  };
});