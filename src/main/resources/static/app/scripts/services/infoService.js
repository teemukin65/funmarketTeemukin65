/**
 * Created by teemu on 1.11.2015.
 */

angular.module('funmarketTeemukin65FrontendApp')
  .service('serviceInfo', ['$resource', '$log',
    function ($resource, $log) {
      return $resource('/manage/info');

    }]).service('metricService', ['$resource', '$log',
    function ($resource, $log) {
      return $resource('/manage/metrics');
    }]);
