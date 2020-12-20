<form id="repsearchform" action="/repairs/search" method="post">
    <div class="mb-3">
        <h6 class="text-muted">REPAIR DATE </h6>
        <div class="validation-message">
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="calendar"></span></span>
                </div>
                <input type="text" class="form-control" id="datepicker" name="repairDate" value="">
            </div>
        </div>
    </div>

    <div class="mb-3">
        <h6 class="text-muted"> BETWEEN FOLLOWING DATES </h6>
        <div class="d-flex align-items-start">
            <div class="validation-message flex-fill mr-2">
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><span data-feather="calendar"></span></span>
                    </div>
                    <input type="text" class="form-control" id="datepicker1" name="BetweenDate1" value="">
                </div>
            </div>
            <div class="validation-message flex-fill">
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><span data-feather="calendar"></span></span>
                    </div>
                    <input type="text" class="form-control" id="datepicker2" name="BetweenDate2" value="">
                </div>
            </div>
        </div>
    </div>
    <div class="mb-3">
        <h6 class="text-muted">OWNER'S SSN </h6>
        <div class="validation-message">
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="user"></span></span>
                </div>
                <input type="text" class="form-control" name="SSN">
            </div>
        </div>
    </div>
    <button class="btn btn-primary btn-lg" type="submit">Search</button>
</form>