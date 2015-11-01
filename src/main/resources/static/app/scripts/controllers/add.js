/**
 * @ngdoc function
 * @name funmarketTeemukin65FrontendApp.controller:AddCtrl
 * @description
 * # AddCtrl
 * Controller of the funmarketTeemukin65FrontendApp
 */


angular.module('funmarketTeemukin65FrontendApp').controller('AddCtrl',
  ['$scope', '$location', '$log', 'funmarketService',
    function ($scope, $location, $log, funmarketService) {

      var _priceStringToCentAmount = function (entered) {
        var parsed = 0;
        if (!entered) {
          return 0;
        }
        entered = entered.replace(',', '.');  // finnish decimal separator replaced with the one understood by parsefloat.
        parsed = parseFloat(entered);
        return Math.floor(parsed * 100);
      }

      $scope.postNewAds = function () {
        $scope.newAdFields.priceCents = _priceStringToCentAmount($scope.newAdFields.enteredPrice);
        delete $scope.newAdFields.enteredPrice;

        return funmarketService.save([], $scope.newAdFields, function (newAds) {
          $log.info('funmarketService, ads saved successfully, id:' + newAds.id ? newAds.id : 'no id provided!');
          $location.path('/');
        });
      }

    }]);
