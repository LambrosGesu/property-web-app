<form id="searchOwnerForm" action="/admin/searchOwner" name="searchOwnerForm" method="POST">
    <div class="d-flex align-items-start">
        <div class="validation-message mb-2 mr-2">
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="user"></span></span>
                </div>
                <input type="text" class="form-control" id="ssn" name="ssn" placeholder="SSN">
            </div>
        </div>

        <div class="validation-message mb-2 mr-2">
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="mail"></span></span>
                </div>
                <input type="text" class="form-control" id="email" name="email" placeholder="Email">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Search</button>
    </div>

</form>