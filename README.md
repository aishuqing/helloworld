#                                     第一个实验
## 一：什么是activity
Activity是Android组件中最基本也是最为常见用的四大组件（Activity，Service服务,Content Provider内容提供者，BroadcastReceiver广播接收器）之 一 。
Activity是一个应用程序组件，提供一个屏幕，用户可以用来交互为了完成某项任务。
Activity中所有操作都与用户密切相关，是一个负责与用户交互的组件，可以通过setContentView(View)来显示指定控件。
在一个android应用中，一个Activity通常就是一个单独的屏幕，它上面可以显示一些控件也可以监听并处理用户的事件做出响应。Activity之间通过Intent进行通信。
### 二：activity的基本状态
在android 中，Activity 拥有四种基本状态：
Active/Running
一个新 Activity 启动入栈后，它显示在屏幕最前端，处理是处于栈的最顶端（Activity栈顶），此时它处于可见并可和用户交互的激活状态,叫做活动状态或者运行状态（active or running）。
2. Paused
当 Activity失去焦点， 被一个新的非全屏的Activity 或者一个透明的Activity 被放置在栈顶，此时的状态叫做暂停状态（Paused）。此时它依然与窗口管理器保持连接，Activity依然保持活力（保持所有的状态，成员信息，和窗口管理器保持连接），但是在系统内存极端低下的时候将被强行终止掉。所以它仍然可见，但已经失去了焦点故不可与用户进行交互。
3. Stopped
如果一个Activity被另外的Activity完全覆盖掉，叫做停止状态（Stopped）。它依然保持所有状态和成员信息，但是它不再可见，所以它的窗口被隐藏，当系统内存需要被用在其他地方的时候，Stopped的Activity将被强行终止掉。
4. Killed
如果一个Activity是Paused或者Stopped状态，系统可以将该Activity从内存中删除，Android系统采用两种方式进行删除，要么要求该Activity结束，要么直接终止它的进程。当该Activity再次显示给用户时，它必须重新开始和重置前面的状态。
#### 三：activity的七种回调
    onCreate：在首次创建 Activity 时调用。系统向此方法传递一个 Bundle 对象，其中包含 Activity 的上一状态，不过前提是捕获了该状态，而后会调用onStart方法。（可以在此方法中执行所有正常的静态设置 ，比如：创建视图、将数据绑定到列表等等。）
    onStart：在 Activity 即将对用户可见之前调用。而后如果Activity转入了前台就会调用onResume方法。 如果此时直接屏幕熄灭或者用户按下home键则会直接调用onStop方法，当然这种情况比较极端。
    onResume：在 Activity 即将开始与用户进行交互之前调用。 此时，Activity 处于 Activity 堆栈的顶层，并具有用户输入焦点。当跳转另一个Activity，或者退出当前Activity后会调用onPause方法。
    onPause：在系统即将开始继续另一个 Activity 时调用。 此方法通常用于确认对持久性数据的未保存更改、停止动画以及其他可能消耗 CPU 的内容，诸如此类。 它应该非常迅速地执行所需操作，因为它返回后，下一个 Activity 才能继续执行,所以不能执行耗时操作。而后正常情况下会调用onStop方法。但是有一种极端情况，就是如果这个时候快速让 当前Activity 返回前台，则会调用onResume方法。
    onStop：在 Activity 对用户不再可见时调用。如果 Activity 被销毁，或另一个 Activity（一个现有 Activity 或新 Activity）继续执行并将其覆盖，就会调用此方法。而后如果 Activity 恢复与用户的交互，则会调用 onRestart 方法，如果 Activity 被销毁，则会调用onDestroy方法。
    onRestart：在Activity被停止后再次启动时调用（即屏幕熄灭后再次回到app，按下home键后再次回到app），而后会调用onStart方法。
    onDestroy：在 Activity 被销毁前调用，这是 Activity 收到的最后调用。 当 Activity 结束（对 Activity 调用了 finish 方法），或系统为节省空间而暂时销毁该 Activity 实例时，可能会调用它。 你可以通过 isFinishing 方法区分这两种情形。
##### 四：截图
![这是helloworld的截图](https://github.com/aishuqing/helloworld/blob/master/app/屏幕快照%202019-03-18%20下午9.06.46.png)
![这是activity 的截图](https://github.com/aishuqing/helloworld/blob/master/app/屏幕快照%202019-03-18%20下午9.07.03.png)
###### 五：关键代码：

    
