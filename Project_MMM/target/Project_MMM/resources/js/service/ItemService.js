'use strict';

App.factory('ItemService', ['$http', '$q', function($http, $q){

	return {
		
			fetchCategoryList: function() {//Fetches category list from server.
				return $http.get('http://localhost:8080/Project_MMM/categories')
					.then(
								function(response){
									return response.data;
								}, 
								function(errResponse){
									console.error('Error while fetching Items');
									return $q.reject(errResponse);
								}
						);
			},

			fetchAllItems: function(category) {//Fetches list of item for a specific category.
					return $http.get('http://localhost:8080/Project_MMM/item/'+category)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while fetching Items');
										return $q.reject(errResponse);
									}
							);
			}
	};

}]);
