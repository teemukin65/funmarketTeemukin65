'use strict';

/**
 * @ngdoc function
 * @name funmarketTeemukin65FrontendApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the funmarketTeemukin65FrontendApp
 */
angular.module('funmarketTeemukin65FrontendApp')
  .controller('AboutCtrl', ['$scope', 'info', function ($scope, info) {

    $scope.serviceInfo = info;


  }]);
