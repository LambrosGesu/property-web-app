<div class="container pt-4">


    <form method="post" action="/admin/editrepair" id="add-repair">

        <div class="form-group">

            <label for="datepicker">Date</label>
            <label for="publicationDate">  </label>
            <div class="input-group">
                <input type="date" name="repairDate" id="repairDate" value="${repair.repairDate}" placeholder="repairDate">
            </div>

        </div>

        <div class="form-group">
            <label for="status">Status</label>

            <select class="custom-select d-block w-100" id="status"  name="status">

                <#if status??>

                    <#list status as status>
                        <option value="${status}"<#if repair.status==status> selected </#if>>${status}</option>
                    </#list>
                </#if>
            </select>
        </div>

        <div class="form-group">
            <label for="jobType">Job Type</label>
            <select class="custom-select d-block w-100" id="jobType"  name="jobType">

                <#if jobTypes??>
                    <#list jobTypes as jobType>
                        <option value="${jobType}" <#if repair.jobType==jobType> selected </#if>>${jobType}</option>
                    </#list>
                </#if>
            </select>
        </div>


        <div class="form-group">
            <label for="price">Price</label>
            <input type="text" name="price" id="price" value="${repair.price}" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" name="address" id="address" value="${repair.address}" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <input type="text" name="description" id="description"  value="${repair.description}" class="form-control"/>
        </div>



<#--        <div class="form-group">-->
<#--            <label for="owners">Owner</label>-->
<#--            <select class="custom-select d-block w-100" id="owner" name="owner">-->
<#--                <#if owners??>-->
<#--                    <#list owners as owner>-->
<#--                        <option value="${owner.id}" <#if repair.owner==owner>selected</#if>>${owner.firstname} ${owner.lastname}</option>-->
<#--                    </#list>-->
<#--                </#if>-->
<#--            </select>-->
<#--        </div>-->

        <div class="form-group">
            <label for="description">SSN</label>
            <input type="text" name="owner" id="owner"  value="${repair.owner.ssn}" class="form-control"/>
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
