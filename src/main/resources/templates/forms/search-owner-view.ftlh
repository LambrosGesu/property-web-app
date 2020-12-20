<form id ="searchOwnerForm" class="search-form-inline" action="/searchOwner" name="searchOwnerForm" method="POST">
    <div class="row">
        <div class="col-4">
            <div class="input-group mb-2 mr-sm-2">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="user"></span></span>
                </div>
                <input type="text" class="form-control" id="ssn" name="ssn" placeholder="SSN">
            </div>
        </div>
        <div class="col-4">
            <div class="input-group mb-2 mr-sm-2">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="mail"></span></span>
                </div>
                <input type="text" class="form-control" id="email" name="email" placeholder="Email">
            </div>
        </div>
        <div class="col-4">
            <button type="submit" class="btn btn-primary mb-2">Search</button>
        </div>
    </div>
</form>