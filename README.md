#第一个实验
##一 什么是activity
###Activity是Android组件中最基本也是最为常见用的四大组件（Activity，Service服务,Content Provider内容提供者，BroadcastReceiver广播接收器）之一 [1]  。
Activity是一个应用程序组件，提供一个屏幕，用户可以用来交互为了完成某项任务。
Activity中所有操作都与用户密切相关，是一个负责与用户交互的组件，可以通过setContentView(View)来显示指定控件。
在一个android应用中，一个Activity通常就是一个单独的屏幕，它上面可以显示一些控件也可以监听并处理用户的事件做出响应。Activity之间通过Intent进行通信。
