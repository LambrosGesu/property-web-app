<!DOCTYPE html>
<html lang="en">
<head>
    <#include "../partials/head.ftlh">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">

</head>
<body>
<#include "../partials/navbar.ftlh">

<div class="container-fluid">
    <div class="row">

        <#include "../partials/sidebar_admin.ftlh">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <h2>Search Repairs</h2>
                    <#include "../forms/repairSearchForm.ftlh">
                    <br>
                    <br>
                    <#if postflag??>
                        <#if repairs??>
                            <#include "../partials/repairs.ftlh">
                        <#else>
                            <h2 class="text-muted">No results found.</h2>
                        </#if>
                    </#if>


                    </div>
            </div>
        </main>
    </div>
</div>

<#include "../partials/scripts.ftlh">

</body>
</html>