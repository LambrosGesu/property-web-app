
<form id ="searchOwnerForm" class="form-inline" action="/searchOwner" name="searchOwnerForm" method="POST">
    <label class="sr-only" for="ssn"></label>
    <div class="input-group mb-2 mr-sm-2">
        <div class="input-group-prepend">
            <span class="input-group-text"><span data-feather="user"></span></span>
        </div>
        <input type="text" class="form-control" id="ssn" name="ssn" placeholder="Α.Φ.Μ.">
    </div>


    <label class="sr-only" for="email"></label>
    <div class="input-group mb-2 mr-sm-2">
        <div class="input-group-prepend">
            <span class="input-group-text"><span data-feather="mail"></span></span>
        </div>
        <input type="text" class="form-control" id="email" name="email" placeholder="Email">
    </div>

    <button type="submit" class="btn btn-primary mb-2">Search</button>
</form>
