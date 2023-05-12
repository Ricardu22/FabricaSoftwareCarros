(function(){
    $("#tabclientes").on("click",".js-delete", function(){
        let botaoClicado = $(this);
        $("#btnsim").attr("data-id",botaoClicado.attr("data-id"));
        $("#modalcliente").modal("show");
    })
    $("#btnsim").on("click", function(){
        let botaoSim = $(this);
        let id = botaoSim.attr("data-id");
        $.ajax({
            url: "/cliente/remover/" + id,
            method: "GET",
            success: function(){
                window.location.href="/cliente";
            }
        })
    });

})();