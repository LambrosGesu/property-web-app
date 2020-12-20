
(function () {
    $('#add-repair').validate({
        rules: {
            repairDate: {
                required: true
            },
            price: {
                required: true,
                number:true
                },
            address: {
                required: true
            },
            description: {
                required: false
            },
            owner: {
                required: true,
                digits: true,
                minlength: 9,
                maxlength: 9
            }

        },
        messages: {
            repairDate: {
                required: "Please insert a date"
            },
            price: {
                required: "Please insert the price",
                number: "Only digits please"
            },
            address: {
                required: "Please insert an address"
            },
            owner: {
                required: "Please insert the Owner SSN",
                digits: "Only digits please",
                minlength: "The length must exact 9 digits",
                maxlength: "The length must exact 9 digits"
            }
        }
    });
})();

