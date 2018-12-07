
jQuery(function (jQuery) {

    jQuery.fn.MasterMainPage("fn_PartialLoader");

    //jQuery.fn.MasterMainPage("fn_PartialLoader",$("#asdads") ,"show");

});

; (function (jQuery, window, document, undefined) {
    var defaults = {}

    var MasterMainPageFunctions = { //PRIVATE FUNCTIONS
        StaffInformationLoaded: false,
        StaffInformation: null,
        CurrentQuestion: {},
        _init: function (options) {
            this._bind()
            this._setDefaults()
        },
        _setDefaults: function () {
            
        },
        _bind: function () {


        },
        CallApi: function (url, type, data, callbacks) {
            var callbacks = callbacks || {}
            var data = data || {}
            $.ajax({
                url: url,
                data: data,
                contentType: "application/json; charset=utf-8",
                dataType: 'json',
                type: type,
                beforeSend: function () {
                    if (callbacks.beforeSend) callbacks.beforeSend()
                },
                success: function (result) {
                    if (callbacks.success) callbacks.success(result)
                },
                complete: function (e) {
                    if (callbacks.complete) callbacks.complete()
                },
                error: function (e) {
                    if (callbacks.error) callbacks.error()
                }
            });
        },
        

        Validation: {

            _init: function ($container) {
                

              
                $container.validate({

                    errorClass: "my-error-class",
                    validClass: "my-valid-class",
                  
                });
                var msjError = "";
                jQuery.validator.addMethod("validByItem", function (value, element) {
                    var returnVal = true;
                  
                    var dep = $('#tipo').val();
                   
                    if (dep == "dni") {

                        if (value.length < 8) {
                            msjError = "Por favor,no escribas menos de 8 caracteres.";
                            returnVal = false;
                        }
                       else if (value.length > 8) {
                           msjError = "Por favor,no escribas mas de 8 caracteres.";
                            returnVal = false;
                        }

                    }
                    else if (dep == "carnet de extrangeria") {
                        if (value.length < 12 ) {
                            msjError = "Por favor,no escribas menos de 12 caracteres.";
                            returnVal = false;
                        }
                        else if (value.length > 12) {
                            msjError = "Por favor,no escribas mas de 12 caracteres.";
                            returnVal = false;
                        }
                    }

                    jQuery.validator.messages.validByItem = msjError
                        return returnVal;
                  
                }, msjError);
                


            
                $('input[name="myCode"]').rules('add', {
                    
                    validByItem: true

                });
              

               
                   
                $container.submit(function (event) {

                    if ($container.validate().valid()) {
                       
                        event.preventDefault();

                       
                    }
                });






              
               

            },

           
            IsFormValid: function ($container) {
             
                return $container.valid();
            },
           

        },


        //RELOAD
        fn_PartialLoader: function ($elem, action) {
            if (action == "show") {
                $elem.block({
                    message: '<i class="icon-spinner4 spinner"></i>',
                    overlayCSS: {
                        backgroundColor: '#fff',
                        opacity: 0.8,
                        cursor: 'wait'
                    },
                    css: {
                        border: 0,
                        padding: 0,
                        backgroundColor: 'none'
                    }
                });
            }
            else if (action == "hide") {
                $elem.unblock();
            }
        },

        
        messagealert: function (action) {
            if (action == "save") {
                alertify.set('notifier', 'position', 'top-right');
                alertify.success("Agregados correctamente");
            }
            else if (action == "update") {
                alertify.set('notifier', 'position', 'top-right');
                alertify.success("Actualizados correctamente");
            }
            else if (action=="error"){
                alertify.set('notifier', 'position', 'top-right');
                alertify.error('Error al guardar los datos');

            } else if (action == "warning") {
                alertify.set('notifier', 'position', 'top-right');
                alertify.warning('Falta rellenar algunos campos');
            }
        }

       

    };

    var MasterMainPageMethods = { //PUBLIC METHODS
        init: function (options) {
            defaults = jQuery.extend({}, defaults, options)
            MasterMainPageFunctions._init(defaults);
        },
        CallApi: function (url, type, data, callbacks) {
            MasterMainPageFunctions.CallApi(url, type, data, callbacks)
        },
        fn_PartialLoader: function ($elem, action) {
            MasterMainPageFunctions.fn_PartialLoader($elem, action)
        },
        messagealert: function(action){
                MasterMainPageFunctions.messagealert(action)
            },

            fn_InitValidation : function ($container) {
                return MasterMainPageFunctions.Validation._init($container)
            },

            fn_IsFormValid : function ($container) {
                return MasterMainPageFunctions.Validation.IsFormValid($container)
            },
        
         
    };

    jQuery.fn.MasterMainPage = function (method) {
        if (MasterMainPageMethods[method]) { return MasterMainPageMethods[method].apply(this, Array.prototype.slice.call(arguments, 1)); }
        else if (typeof method === 'object' || !method) { return MasterMainPageMethods.init.apply(this, arguments); }
        else if (method.split(".").length === 2) {
            if (typeof MasterMainPageMethods[method.split(".")[0]] === 'object') {
                return MasterMainPageMethods[method.split(".")[0]][method.split(".")[1]].apply(this, Array.prototype.slice.call(arguments, 1))
            }
            // return MasterMainMethods.init.apply(this, arguments);
        }
        else { $.error('Method ' + method + ' does not exist'); }
    };

})(jQuery, window, document);