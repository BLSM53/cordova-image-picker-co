var Permission = function() {

};

Permission.prototype.hasReadPermission = function(callback) {
    alert('has');
    return cordova.exec(callback, null, "Permission", "hasReadPermission", []);
};

Permission.prototype.requestReadPermission = function(callback) {
    alert('request');
    return cordova.exec(callback, null, "Permission", "requestReadPermission", []);
};

window.Permission = new Permission();