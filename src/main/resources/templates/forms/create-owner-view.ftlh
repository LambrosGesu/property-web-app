<#import "/spring.ftl" as spring />
<div class="container pt-4">

    <form method="post" action="/owner/create" id="add-owner">

        <div class="form-group">

            <label for="ssn">SSN</label>
            <@spring.bind "ownerform.ssn"/>
            <input type="text" name="ssn" id="ssn" class="form-control"/>
            <#if spring.status.error??>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>


        <div class="form-group">
            <label for="firstname">First Name</label>
            <input type="text" name="firstname" id="firstname" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="lastname">Last Name</label>
            <input type="text" name="lastname" id="lastname" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" name="address" id="address" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="phone_number">Phone Number</label>
            <input type="text" name="phone_number" id="phone_number" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="email">Email</label>
            <input type="text" name="email" id="email" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="text" name="password" id="password" class="form-control"/>
        </div>

        <div class="form-group">
            <select class="custom-select d-block w-100" id="propertyType" name="propertyType">
            <#if propertyType??>
                <#list propertyType as property>
                    <option value="${property}">${property}</option>
                </#list>
            </#if>
            </select>
        </div>
        <input type="submit" class="btn btn-primary"/>

    </form>
</div>



