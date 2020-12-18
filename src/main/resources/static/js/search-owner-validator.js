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
        },
        errorElement: "em",
        errorPlacement: function ( error, element ) {
            // Add the `help-block` class to the error element
            error.addClass( "help-block" );

            // Add `has-feedback` class to the parent div.form-group
            // in order to add icons to inputs
            element.parents( ".input-group mb-2 mr-sm-2" ).addClass( "invalid-feedback" );


            // Add the span element, if doesn't exists, and apply the icon classes to it.
            if ( !element.next( "span" )[ 0 ] ) {
                $( "<span class='glyphicon glyphicon-remove form-control-feedback'></span>" ).insertAfter( element );
            }
        },
        success: function ( label, element ) {
            // Add the span element, if doesn't exists, and apply the icon classes to it.
            if ( !$( element ).next( "span" )[ 0 ] ) {
                $( "<span class='glyphicon glyphicon-ok form-control-feedback'></span>" ).insertAfter( $( element ) );
            }
        },
        highlight: function ( element, errorClass, validClass ) {
            $( element ).parents( ".input-group mb-2 mr-sm-2" ).addClass( "is-invalid" ).removeClass( "is-valid" );
            $( element ).next( "span" ).addClass( "glyphicon-remove" ).removeClass( "glyphicon-ok" );
        },
        unhighlight: function ( element, errorClass, validClass ) {
            $( element ).parents( ".input-group mb-2 mr-sm-2" ).addClass( "is-valid" ).removeClass( "is-invalid" );
            $( element ).next( "span" ).addClass( "glyphicon-ok" ).removeClass( "glyphicon-remove" );
        }
    });
})();

