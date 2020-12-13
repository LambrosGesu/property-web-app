<!DOCTYPE html>
<html lang="en">
<head>


    <title>User Page</title>
    <#include "./partials/head.ftlh">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body>
<#include "./partials/navbar.ftlh">

<div class="container-fluid">
    <div class="row">

        <#include "partials/sidebar_user.ftlh">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <h2>Here is your information</h2>
                    <table class="table">
                        <thead>
                        <th>ID</th>
                        <th>Full Name</th>
                        <th>Address</th>
                        <th>Phone Number</th>
                        <th>Email</th>
                        <th>PropertyType</th>

                        </thead>

                        <tbody>
                            <tr data-id="${owner.id}">
                                <td>${owner.id}</td>
                                <td>${owner.firstname} ${owner.lastname}</td>
                                <td>${owner.address}</td>
                                <td>${owner.phone_number}</td>
                                <td>${owner.email}</td>
                                <td>${owner.propertyType}</td>

                            </tr>

                        </tbody>
                    </table>
                </div>
            </div>
        </main>
    </div>
</div>

<#include "./partials/scripts.ftlh">

</body>
</html>