<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "../partials/head.ftlh">
</head>
<body>
<#include "../partials/navbar.ftlh">

<div class="container-fluid">
    <div class="row">

        <#include "../partials/sidebar_admin.ftlh">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <h2>Search Owner</h2>
                    <#include "../forms/searchOwnerForm.ftlh">
                    <#if owners??>
                        <#include "../partials/owners.ftlh">
                    </#if>
                </div>
            </div>
        </main>
    </div>
</div>

<#include "../partials/scripts.ftlh">

</body>
</html>
