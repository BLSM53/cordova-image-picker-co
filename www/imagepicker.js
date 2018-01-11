/*global cordova,window,console*/
/**
 * An Image Picker plugin for Cordova
 *
 * Developed by Wymsee for Sync OnSet
 */

var ImagePicker = function() {

};

ImagePicker.prototype.hasReadPermission = function(callback) {
    return cordova.exec(callback, null, "ImagePicker", "hasReadPermission", []);
};

ImagePicker.prototype.requestReadPermission = function(callback) {
    return cordova.exec(callback, null, "ImagePicker", "requestReadPermission", []);
};

window.imagePicker = new ImagePicker();