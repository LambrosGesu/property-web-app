<#import "/spring.ftl" as spring />
<div class="container pt-4">

    <form method="post" action="/admin/edit-owner" name="ownerForm" id="ownerForm">
        <input type="hidden" name="id" value="${owner.id}">
        <div class="form-group validation-message">
            <label for="ssn">SSN</label>
            <@spring.bind "ownerForm.ssn"/>
            <input type="text" name="ssn" id="ssn" value="${owner.ssn}" class="form-control"/>
            <#if ssnErrorFlag??>
                <div class="" style="color:red">SSN already in use.</div>
            </#if>
        </div>


        <div class="form-group validation-message">
            <label for="firstname">First Name</label>
            <@spring.bind "ownerForm.firstname"/>
            <input type="text" name="firstname" id="firstname" value="${owner.firstname}" class="form-control"/>
            <#if spring.status.error??>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>

        <div class="form-group validation-message">
            <label for="lastname">Last Name</label>
            <@spring.bind "ownerForm.lastname"/>
            <input type="text" name="lastname" id="lastname" value="${owner.lastname}"class="form-control"/>
            <#if spring.status.error??>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>

        <div class="form-group validation-message">
            <label for="address">Address</label>
            <@spring.bind "ownerForm.address"/>
            <input type="text" name="address" id="address" value="${owner.address}" class="form-control"/>
            <#if spring.status.error??>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>

        <div class="form-group validation-message">
            <label for="phone_number">Phone Number</label>
            <@spring.bind "ownerForm.phone_number"/>
            <input type="text" name="phone_number" id="phone_number" value="${owner.phone_number}" class="form-control"/>
            <#if spring.status.error??>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>

        <div class="form-group validation-message">
            <label for="email">Email</label>
            <@spring.bind "ownerForm.email"/>
            <input type="text" name="email" id="email" value="${owner.email}" class="form-control"/>
            <#if spring.status.error??>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>

        <div class="form-group validation-message">
            <label for="propertyType">Property Type</label>
            <select class="custom-select d-block w-100" id="propertyType" name="propertyType">
                <#if propertyType??>
                    <#list propertyType as property>
                        <option value="${property}"<#if owner.propertyType == property> selected</#if>>${property}</option>
                    </#list>
                </#if>
            </select>
        </div>
        <button type="submit" class="btn btn-primary mb-2">Submit</button>

    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>

