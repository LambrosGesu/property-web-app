<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Owners</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">


</head>
<body>

<div class="container pt-4">


    <form method="post" action="/repair/create" id="add-repair">

        <div class="form-group">

                <label for="datepicker">Date</label>
                <label for="publicationDate">  </label>
                <div class="input-group">
                    <input type="date" name="repairDate" id="repairDate" placeholder="repairDate">
                </div>

        </div>

        <div class="form-group">
            <label for="status">Status</label>

            <select class="custom-select d-block w-100" id="status" name="status">

                <#if status??>

                    <#list status as status>
                        <option value="${status}">${status}</option>
                    </#list>
                </#if>
            </select>
        </div>

        <div class="form-group">
            <label for="jobType">Job Type</label>
            <select class="custom-select d-block w-100" id="jobType" name="jobType">

                <#if jobTypes??>
                    <#list jobTypes as jobType>
                        <option value="${jobType}">${jobType}</option>
                    </#list>
                </#if>
            </select>
        </div>


        <div class="form-group">
            <label for="price">Price</label>
            <input type="text" name="price" id="price" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" name="address" id="address" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <input type="text" name="description" id="description" class="form-control"/>
        </div>



        <div class="form-group">
            <label for="owners">Owner</label>
            <select class="custom-select d-block w-100" id="owner" name="owner">
                <#if owners??>
                    <#list owners as owner>
                        <option value="${owner.id}">${owner.firstname} ${owner.lastname}</option>
                    </#list>
                </#if>
            </select>
        </div>
        <input type="submit" class="btn btn-primary"/>

    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>

</body>

</html>