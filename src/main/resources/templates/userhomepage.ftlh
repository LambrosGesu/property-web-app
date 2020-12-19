<!DOCTYPE html>
<html lang="en">
<head>

    <title>User Page</title>
    <#include "./partials/head.ftlh">
    <!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">-->

</head>
<body>
<#include "./partials/navbar.ftlh">

<div class="container-fluid">
    <div class="row">

        <#include "partials/sidebar_user.ftlh">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <h2>Hello! Here are your repairs</h2>
                    <#include "partials/repairsusers.ftlh">
                </div>
            </div>
        </main>
    </div>
</div>

<#include "./partials/scripts.ftlh">

</body>
</html>