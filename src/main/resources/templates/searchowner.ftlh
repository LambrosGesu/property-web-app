<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>


    <#include "./partials/head.ftlh">
    <!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">-->

</head>
<body>
<#include "./partials/navbar.ftlh">

<div class="container-fluid">
    <div class="row">

        <#include "partials/sidebar_admin.ftlh">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <h2>Search Owner</h2>
                    <#include "forms/searchOwnerForm.ftlh">
                    <#if owners??>
                        <table class="table table-striped table-sm">
                            <thead>
                            <tr>
                                <#--                    <th>#ID</th>-->
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Address</th>
                                <th>Phone Number</th>
                                <th>Email</th>
                                <th>Α.Φ.Μ.</th>
                            </tr>
                            </thead>
                            <tbody>
                            <#list owners as owner>
                                <tr>
                                    <td>${owner.firstname}</td>
                                    <td>${owner.lastname}</td>
                                    <td>${owner.address}</td>
                                    <td>${owner.phone_number}</td>
                                    <td>${owner.email}</td>
                                    <td>${owner.ssn}</td>
                                </tr>
                            </#list>
                            </tbody>
                        </table>
                    </#if>
                </div>
            </div>
        </main>
    </div>
</div>

<#include "./partials/scripts.ftlh">

</body>
</html>