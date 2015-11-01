/**
 * Created by teemu on 30.10.2015.
 */

angular.module('funmarketTeemukin65FrontendApp').service('funmarketService', ['$resource', '$log',
  function ($resource, $log) {
    return $resource('/api/market/ads/:id');

  }])
