(function () {
    $('#searchOwnerForm').validate({
        rules: {
            ssn: {
                required: false,
                digits: true,
                minlength: 9,
                maxlength: 9
            },
            email: {
                email: true
            }
        },
        messages: {
            ssn: {
                minlength: "It should be 9 digits.",
                maxlength: "It should be 9 digits."
            }
        }
    });
})();

