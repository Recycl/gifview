android中现在没有直接显示gif的view,只能通过mediaplay来显示，且还常常不能正常显示出来，为此写了这个gifview，其用法和imageview一样

in android,there is not a view to show gif image,you can only use mediaplay,but this is not a view.so i create the gifview.

---

# 因为我现在无法在downloads中上传源码，最新源码放在source中，以后Downloads中的代码不再更新 #
the newest source code is in source svn.

---

## 使用说明 ##

1.在你的工程中新建一个lib目录，并把gifview.jar放到里面。
> create "lib" dir in you project,and put gifview.jar in .
2.在编译路径中添加对这个jar的引用。
> import gifview.jar in build path.
3.在使用时，可以直接在layout文件中定义gifview，但只能在代码中设置gif图片（setgifimage)
> you can define gifview in layout ,but you only can set the gif image in source code(the function setGifImage)

---

**已知bug**:
如果图档过大，会出现OOM
> if the gif image is too large,maybe OOM.

为了解决图档太大时的OOM，我想把gif解析时的图片先存入到文件中，在显示时直接从文件中读入，但这样的话，显示的效果不好。在最新的代码中有此功能，但并没有使用，如果有谁能进一步解决此问题，请告诉我，或者让我把您把到项目成员中。


---

**2.0版本已经提交到source中**
> version 2.0 committed in svn.
  * trunk中是gifview的源码。
> > trunk dir is gifview source
  * demo中是一个demo的代码。
> > demo dir is a demo project
  * lib中是gifview.jar。
> > lib dir is gifview.jar


---

**1.1版本增加以下功能**

1.增加gif在解码过程中的图片显示方式，当gif比较大时，解码有一个过程，需要一些时间，在此解码过程中，可以设置三种gif显示方式：
  * WAIT\_FINISH.这种方式在解码过程中，不会显示任何图片，等到Gif全部解码结束后，再显示整个gif动画。
  * COVER.这种方式在解码过程中，只显示第一帧，在gif全部解码结束后，显示整个Gif动画。
  * SYNC\_DECODER.这种方式与解码同步，解码解到哪帧，显示到哪帧。

