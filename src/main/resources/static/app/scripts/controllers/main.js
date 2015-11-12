'use strict';

/**
 * @ngdoc function
 * @name funmarketTeemukin65FrontendApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the funmarketTeemukin65FrontendApp
 */
angular.module('funmarketTeemukin65FrontendApp')
  .controller('MainCtrl', ['$scope', '$log', 'funmarketService', function ($scope, $log, funmarketService) {
    $scope.adsList = funmarketService.query();

    $scope.deleteAd = function(id){

      $log.debug("deleteAds: id="+id);
      if( confirm("Haluatko todella poistaa tämän ilmoituksen")){
        funmarketService.delete({id:id},{},function(successStatus){
          $scope.adsList = funmarketService.query()
        });
      }
    }


  }]);
