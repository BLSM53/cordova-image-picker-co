var Permission = function() {

};

Permission.prototype.hasReadPermission = function(callback) {
    return cordova.exec(callback, null, "Permission", "hasReadPermission", []);
};

Permission.prototype.requestReadPermission = function(callback) {
    return cordova.exec(callback, null, "Permission", "requestReadPermission", []);
};

window.Permission = new Permission();