(function(){
    $("#tabclientes").on("click",".js-delete",function(){
        let botaoClicado = $(this);
        $("#btnsim").attr("data-id",botaoClicado.attr("data-id"));
        $("#modalcliente").modal("show");

    })

    $("#btnsim").on("click",function(){
        console.log("passei 1")
        let botaoSim = $(this);
        console.log("passei 2")
        let id = botaoSim.attr("data-id");
        $.ajax({
            url: "/cliente/remover/" + id,
            method: "GET" , 
            success: function(){
                console.log("passei 3")
                window.location.href = "/cliente";
            }

        })

    });


})();
