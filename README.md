# cordova-image-read-permission
获取read权限的cordova插件，将`cordova-image-picker`的检查/获取权限的功能抽出

## 安装
`cordova plugin add https://github.com/BLSM53/cordova-plugin-read-permission.git`

## 使用
```
window.Permission.hasReadPermission(function(result){
    // result为检查是否有读取权限的结果，true/false
});

window.Permission.requestReadPermission(function(){
    // 回调函数
});
```
