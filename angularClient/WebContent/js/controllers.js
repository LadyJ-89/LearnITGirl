/*var raControllers = angular.module('raControllers', []);
   
raControllers.controller(UsersListController', ['$scope','UsersService',function($scope,UsersService)
 
{
 
       $scope.users=UsersService.users();
 
        
 
}]);
 
   
raControllers.controller('UserDetailsController', ['$scope', '$routeParams','UsersService',
 
 function($scope, $routeParams,UsersService) {
 
   $scope.user = UsersService.user({id: $routeParams.user_id});
 
 }]);
 */

var raControllers = angular.module('raControllers', []);

// create the controller and inject Angular's $scope
scotchApp.controller('mainController', function($scope) {
	// create a message to display in our view
	$scope.message = 'Everyone come and see how good I look!';
});

scotchApp.controller('aboutController', function($scope) {
	$scope.message = 'Look! I am an about page.';
});

scotchApp.controller('contactController', function($scope) {
	$scope.message = 'Contact us! JK. This is just a demo.';
});

scotchApp.controller('usersController', function($scope, $http) {
	$http.get('http://localhost:8181/spingService/service/users').
    success(function(data) {
        $scope.users = data;
    });
});

scotchApp.controller('userController', function($scope,$http) {
	$http.get('http://localhost:8181/spingService/service/user?id=100').
    success(function(data) {
        $scope.user = data;
    });
    
});
/*
scotchApp.controller('usersController', function(UsersService) {
	UsersService.all()
    .then(function (result) {
    	$scope.users = result.data;
    });
});

scotchApp.controller('userController', function(UsersService) {
	UsersService.fetch(100)
    .then(function (result) {
    	$scope.user = result.data;
    });
});*/