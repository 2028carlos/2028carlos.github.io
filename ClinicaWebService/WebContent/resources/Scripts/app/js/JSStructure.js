
jQuery(function (jQuery) {

    jQuery.fn.aspxPage();

});

; (function (jQuery, window, document, undefined) {
    var defaults = {}

    var aspxPageFunctions = { //PRIVATE FUNCTIONS
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

        	
            
        }
    };

    var aspxPageMethods = { //PUBLIC METHODS
        init: function (options) {
            defaults = jQuery.extend({}, defaults, options)
            aspxPageFunctions._init(defaults);
        }
    };

    jQuery.fn.aspxPage = function (method) {
        if (aspxPageMethods[method]) { return aspxPageMethods[method].apply(this, Array.prototype.slice.call(arguments, 1)); }
        else if (typeof method === 'object' || !method) { return aspxPageMethods.init.apply(this, arguments); }
        else if (method.split(".").length === 2) {
            if (typeof aspxPageMethods[method.split(".")[0]] === 'object') {
                return aspxPageMethods[method.split(".")[0]][method.split(".")[1]].apply(this, Array.prototype.slice.call(arguments, 1))
            }
            // return MasterMainMethods.init.apply(this, arguments);
        }
        else { $.error('Method ' + method + ' does not exist'); }
    };

})(jQuery, window, document);