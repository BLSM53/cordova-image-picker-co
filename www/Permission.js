var exec = require('cordova/exec');

exports.getAlbumPermission = function(success, error) {
    exec(success, error, "Permissio", "getAlbumPermission", []);
};