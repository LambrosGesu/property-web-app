<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Owners</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <link href="/css/main.css" rel="stylesheet">
</head>
<body>


<table class="table">
    <thead>
    <th>ID</th>
    <th>Full Name</th>
    <th class="text-center">Edit</th>
    <th class="text-center">Remove</th>
    </thead>

    <tbody>
    <#list owners as owner>
        <tr data-id="${owner.id}">
            <td>${owner.id}</td>
            <td>${owner.firstname} ${owner.lastname}</td>
            <td class="text-center">
                <a href="/edit-owner/${owner.id}">
                    <span data-feather="tool"></span>
                </a>
            </td>
            <td class="text-center">
                <a href="#" data-toggle="modal" data-target="#remove">
                    <span data-feather="x"></span>
                </a>
            </td>
        </tr>
    </#list>
    </tbody>
</table>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script src="/js/main.js"></script>
</body>

</html>