<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Repairs</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>


<table class="table">
    <thead>
    <th>Date</th>
    <th>Status</th>
    <th>Job Type</th>
    <th>Price</th>
    <th>Address</th>
    <th>Description</th>
    <th>Owner</th>
    </thead>

    <tbody>
    <#list repairs as repair>
        <tr data-id="${repair.id}">
            <td>${repair.repairDate}</td>
            <td>${repair.status}</td>
            <td>${repair.jobType}</td>
            <td>${repair.price}</td>
            <td>${repair.address}</td>
            <td>${repair.description}</td>
            <td>${repair.owner.firstname} ${repair.owner.lastname}</td>

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

</body>

</html>