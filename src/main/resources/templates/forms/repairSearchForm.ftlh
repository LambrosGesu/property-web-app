<#import "/spring.ftl" as spring />



<form id ="repsearchform" action="/repairs/search" method="post">
    <div class="mb-3">

        <h6 class="text-muted">Repair Date    </h6>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="calendar"></span></span>
            </div>
            <input type="text" class="form-control" id="datepicker" name="repairDate" placeholder="yyyy-mm-dd">
        </div>

        <h6 class="text-muted">   BETWEEN FOLLOWING DATES   </h6>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="calendar"></span></span>
            </div>
            <input type="text" class="form-control" id="datepicker1" name="BetweenDate1" placeholder="yyyy-mm-dd">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="calendar"></span></span>
            </div>
            <input type="text" class="form-control" id="datepicker2" name="BetweenDate2" placeholder="yyyy-mm-dd">
        </div>

        <h6 class="text-muted">OWNER'S SSN  </h6>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="user"></span></span>
            </div>
            <input type="text" class="form-control"  name="SSN" placeholder="*********">
        </div>

    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>

</form>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>