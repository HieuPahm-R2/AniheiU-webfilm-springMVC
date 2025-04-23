<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <header class="header" ng-app="category" ng-controller="categoryController">
        <div class="header__wrap">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="header__content">
                            <!-- header logo -->
                            <a href="/" class="header__logo">
                                <img src="/img/logo.svg" alt="">
                            </a>
                            <!-- end header logo -->

                            <!-- header nav -->
                            <ul class="header__nav">
                                <li class="header__nav-item">
                                    <a class="header__nav-link" href="/">Home</a>
                                </li>

                                <!-- dropdown -->
                                <li class="header__nav-item">
                                    <a class="dropdown-toggle header__nav-link" href="#" role="button"
                                        id="dropdownMenuCatalog" data-toggle="dropdown" aria-haspopup="true"
                                        aria-expanded="false">Category</a>
                                    <!--Angular js-->
                                    <ul class="dropdown-menu header__dropdown-menu"
                                        aria-labelledby="dropdownMenuCatalog">
                                        <li ng-repeat="x in responseData"><a href={{"/category/"+x.id}}>{{x.name}}</a>
                                        </li>
                                    </ul>
                                </li>
                                <!-- end dropdown -->

                                <li class="header__nav-item">
                                    <a href="#" class="header__nav-link">Need Help?</a>
                                </li>
                            </ul>
                            <!-- end header nav -->

                            <!-- header auth -->
                            <div class="header__auth">
                                <button class="header__search-btn" type="button">
                                    <i class="icon ion-ios-search"></i>
                                </button>

                                <a href="#" class="header__sign-in">
                                    <i class="icon ion-ios-log-in"></i>
                                    <span>sign in</span>
                                </a>
                            </div>
                            <!-- end header auth -->
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- header search -->
        <form action="#" class="header__search">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="header__search-content">
                            <input type="text" placeholder="Search for a movie, TV Series that you are looking for">
                            <button type="button">search</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
        <!-- end header search -->
    </header>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.8.3/angular.min.js"
        integrity="sha512-KZmyTq3PLx9EZl0RHShHQuXtrvdJ+m35tuOiwlcZfs/rE7NZv29ygNA8SFCkMXTnYZQK2OX0Gm2qKGfvWEtRXA=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script>
        let myApp = angular.module("category", []);
        myApp.controller('categoryController', function ($scope, $http) {
            // CALL API
            $http.get('http://localhost:8082/api/ver1/category-api/get-all-categories')
                .then(function (response) {
                    $scope.responseData = response.data;
                    console.log(response.data)
                })
                .catch(function (error) {
                    // handle error
                    console.error('Error:', error);
                });
        });
    </script>