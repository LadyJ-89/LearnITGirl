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

scotchApp.controller('usersController', function($scope, UsersService) {
	UsersService.all()
    .then(function (result) {
    	$scope.users = result.data;
    });
});

scotchApp.controller('userController', function($scope, $routeParams, UsersService) {
	UsersService.fetch($routeParams.user_id)
    .then(function (result) {
    	$scope.user = result.data;
    });
});