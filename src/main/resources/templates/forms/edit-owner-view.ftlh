
<div class="container pt-4">

    <form method="post" action="" id="add-owner">

        <div class="form-group">
            <label for="ssn">SSN</label>
            <input type="text" name="ssn" id="ssn" value="${owner.ssn}" class="form-control"/>
        </div>


        <div class="form-group">
            <label for="firstname">First Name</label>
            <input type="text" name="firstname" id="firstname" value="${owner.firstname}" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="lastname">Last Name</label>
            <input type="text" name="lastname" id="lastname" value="${owner.lastname}"class="form-control"/>
        </div>

        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" name="address" id="address" value="${owner.address}" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="phone_number">Phone Number</label>
            <input type="text" name="phone_number" id="phone_number" value="${owner.phone_number}" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="email">Email</label>
            <input type="text" name="email" id="email" value="${owner.email}" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="text" name="password" id="password" value="${owner.password}" class="form-control"/>
        </div>

        <div class="form-group">
            <select class="custom-select d-block w-100" id="propertyType" name="propertyType">

                <#if propertyType??>
                    <#list propertyType as property>
                        <option value="${property}"<#if owner.propertyType == property> selected</#if>>${property}</option>
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
