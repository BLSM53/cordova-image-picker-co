var Permission = function() {

};

Permission.prototype.hasReadPermission = function(callback) {
    return cordova.exec(callback, null, "Permission", "hasPermission", []);
};

Permission.prototype.requestReadPermission = function(callback) {
    return cordova.exec(callback, null, "Permission", "requestPermission", []);
};

window.Permission = new Permission();