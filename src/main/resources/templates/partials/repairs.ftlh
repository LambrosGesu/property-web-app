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
    <th>ID</th>
    <th>Date</th>
    <th>Status</th>
    <th>Job Type</th>
    <th>Price</th>
    <th>Address</th>
    <th>Description</th>
    <th>Owner</th>
    <th class="text-center">Edit</th>
    <th class="text-center">Remove</th>
    </thead>

    <tbody>
    <#list repairs as repair>
        <tr data-id="${repair.id}">
            <td>${repair.id}</td>
            <td>${repair.repairDate}</td>
            <td>${repair.status}</td>
            <td>${repair.jobType}</td>
            <td>${repair.price}</td>
            <td>${repair.address}</td>
            <td>${repair.description}</td>
            <td>${repair.owner.firstname} ${repair.owner.lastname}</td>
            <td class="text-center">
                <a href="/edit-repair/${repair.id}">
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

<div id="remove" class="modal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Repair</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p>Are you sure?</p>
            </div>
            <div class="modal-footer">
                <form method="post" id="deleteForm">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-danger">Delete</button>
                </form>
            </div>
        </div>
    </div>
</div>

</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>

<script src="/js/modal_repair_delete.js"></script>
</body>

</html>