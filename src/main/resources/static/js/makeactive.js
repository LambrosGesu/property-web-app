(function(){
    console.log("is it here?")
    var current = location.pathname;
    $('#navItems li a').each(function(){
        var $this = $(this);
        console.log("dsadsad")
        // if the current path is like this link, make it active
        if($this.attr('href').indexOf(current) !== -1){
            console.log($this.data());
            $this.parent().addClass('active');
        }
    })
});