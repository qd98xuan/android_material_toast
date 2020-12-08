# 个性化Toast
## 一个简单的toast个性化打印,无需传递context对象，内部使用反射获取context
## 下载：
### gradle
build.gradle(project)  
```
llprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
build.gradle(app)  
```
dependencies {
	implementation 'com.github.qd98xuan:material_toast:Tag'
}
```
## 参数：
### 1.需要显示的内容
### 2.显示的类型，不同的类型会显示不同的图标
### 3.Toast的延迟参数
## 图片：

### ToastUtils.makeToast("correct", ToastType.CORRECT,Toast.LENGTH_SHORT)正确
<img src="https://raw.githubusercontent.com/qd98xuan/material_toast/master/image/correct.png" width="540" height="960"/>

### ToastUtils.makeToast("error", ToastType.ERROR,Toast.LENGTH_SHORT)错误
<img src="https://raw.githubusercontent.com/qd98xuan/material_toast/master/image/error.png" width="540" height="960"/>

### ToastUtils.makeToast("problem", ToastType.PROBLEM,Toast.LENGTH_SHORT)警告
<img src="https://raw.githubusercontent.com/qd98xuan/material_toast/master/image/problem%20.png" width="540" height="960"/>

### ToastUtils.makeToast("none", ToastType.NONE,Toast.LENGTH_SHORT)无图标
<img src="https://raw.githubusercontent.com/qd98xuan/material_toast/master/image/none.png" width="540" height="960"/>
