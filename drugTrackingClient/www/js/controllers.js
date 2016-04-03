angular.module('starter.controllers', [])

.controller('DashCtrl', function($scope) {})

.controller('ChatsCtrl',function($scope, UsersService) {
   UsersService.all()
    .then(function (result) {
    	$scope.users = result.data;
    });
})

.controller('SettingsCtrl',function($scope, SettingsService) {
    SettingsService.fetch("asia")
    .then(function (result) {
    	$scope.user = result.data;
    });
})

.controller('PlansCtrl',function($scope, PlansService) {
   PlansService.all()
    .then(function (result) {
    	$scope.plans = result.data;
		//$scope.date = new Date();
    });
})

.controller('PlanDetailCtrl',function($scope, $stateParams, PlansService) {
   PlansService.fetch($stateParams.drugPlanId)
    .then(function (result) {
    	$scope.plan = result.data;
    });
})

.controller('VitalSignsCtrl',function($scope, VitalSignsService) {
   VitalSignsService.all()
    .then(function (result) {
    	$scope.signs = result.data;
    });
})

.controller('VitalSignDetailCtrl',function($scope, $stateParams, VitalSignsService) {
   VitalSignsService.fetch($stateParams.signId)
    .then(function (result) {
    	$scope.sign = result.data;
    });
})

.controller('DrugsCtrl',function($scope, DrugsService) {
   DrugsService.all()
    .then(function (result) {
    	$scope.drugs = result.data;
    });
})

.controller('DrugDetailCtrl',function($scope, $stateParams, DrugsService) {
   DrugsService.fetch($stateParams.drugId)
    .then(function (result) {
    	$scope.drug = result.data;
    });
})

.controller('ChatDetailCtrl', function($scope, $stateParams, Users) {
  //$scope.chat = Chats.get($stateParams.chatId);
  $scope.user = Users.get($stateParams.userId);
})

.controller('AccountCtrl', function($scope) {
  $scope.settings = {
    enableFriends: true
  };
});
