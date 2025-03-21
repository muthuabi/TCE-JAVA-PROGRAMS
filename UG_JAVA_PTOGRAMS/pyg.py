Help on package pygame:

NAME
    pygame

DESCRIPTION
    Pygame is a set of Python modules designed for writing games.
    It is written on top of the excellent SDL library. This allows you
    to create fully featured games and multimedia programs in the python
    language. The package is highly portable, with games running on
    Windows, MacOS, OS X, BeOS, FreeBSD, IRIX, and Linux.

PACKAGE CONTENTS
    __pyinstaller (package)
    _camera_opencv_highgui
    _camera_vidcapture
    _dummybackend
    _freetype
    _numpysndarray
    _numpysurfarray
    _sdl2 (package)
    _sprite
    base
    bufferproxy
    camera
    color
    colordict
    compat
    constants
    cursors
    display
    docs (package)
    draw
    draw_py
    event
    examples (package)
    fastevent
    font
    freetype
    ftfont
    gfxdraw
    image
    imageext
    joystick
    key
    locals
    macosx
    mask
    math
    midi
    mixer
    mixer_music
    mouse
    newbuffer
    pixelarray
    pixelcopy
    pkgdata
    pypm
    rect
    rwobject
    scrap
    sndarray
    sprite
    surface
    surfarray
    surflock
    sysfont
    tests (package)
    threads (package)
    time
    transform
    version

CLASSES
    builtins.BufferError(builtins.Exception)
        BufferError
    builtins.RuntimeError(builtins.Exception)
        error
    builtins.object
        BufferProxy
        Color
        PixelArray
        Rect
        Surface
    
    class BufferError(builtins.BufferError)
     |  Buffer error.
     |  
     |  Method resolution order:
     |      BufferError
     |      builtins.BufferError
     |      builtins.Exception
     |      builtins.BaseException
     |      builtins.object
     |  
     |  Data descriptors defined here:
     |  
     |  __weakref__
     |      list of weak references to the object (if defined)
     |  
     |  ----------------------------------------------------------------------
     |  Methods inherited from builtins.BufferError:
     |  
     |  __init__(self, /, *args, **kwargs)
     |      Initialize self.  See help(type(self)) for accurate signature.
     |  
     |  ----------------------------------------------------------------------
     |  Static methods inherited from builtins.BufferError:
     |  
     |  __new__(*args, **kwargs) from builtins.type
     |      Create and return a new object.  See help(type) for accurate signature.
     |  
     |  ----------------------------------------------------------------------
     |  Methods inherited from builtins.BaseException:
     |  
     |  __delattr__(self, name, /)
     |      Implement delattr(self, name).
     |  
     |  __getattribute__(self, name, /)
     |      Return getattr(self, name).
     |  
     |  __reduce__(...)
     |      Helper for pickle.
     |  
     |  __repr__(self, /)
     |      Return repr(self).
     |  
     |  __setattr__(self, name, value, /)
     |      Implement setattr(self, name, value).
     |  
     |  __setstate__(...)
     |  
     |  __str__(self, /)
     |      Return str(self).
     |  
     |  with_traceback(...)
     |      Exception.with_traceback(tb) --
     |      set self.__traceback__ to tb and return self.
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors inherited from builtins.BaseException:
     |  
     |  __cause__
     |      exception cause
     |  
     |  __context__
     |      exception context
     |  
     |  __dict__
     |  
     |  __suppress_context__
     |  
     |  __traceback__
     |  
     |  args
    
    class BufferProxy(builtins.object)
     |  BufferProxy(<parent>) -> BufferProxy
     |  pygame object to export a surface buffer through an array protocol
     |  
     |  Methods defined here:
     |  
     |  __repr__(self, /)
     |      Return repr(self).
     |  
     |  write(...)
     |      write(buffer, offset=0)
     |      Write raw bytes to object buffer.
     |  
     |  ----------------------------------------------------------------------
     |  Static methods defined here:
     |  
     |  __new__(*args, **kwargs) from builtins.type
     |      Create and return a new object.  See help(type) for accurate signature.
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors defined here:
     |  
     |  __array_interface__
     |      Version 3 array interface, Python level
     |  
     |  __array_struct__
     |      Version 3 array interface, C level
     |  
     |  __dict__
     |      The object's attribute dictionary, read-only
     |  
     |  length
     |      length -> int
     |      The size, in bytes, of the exported buffer.
     |  
     |  parent
     |      parent -> Surface
     |      parent -> <parent>
     |      Return wrapped exporting object.
     |  
     |  raw
     |      raw -> bytes
     |      A copy of the exported buffer as a single block of bytes.
    
    class Color(builtins.object)
     |  Color(r, g, b) -> Color
     |  Color(r, g, b, a=255) -> Color
     |  Color(color_value) -> Color
     |  pygame object for color representations
     |  
     |  Methods defined here:
     |  
     |  __add__(self, value, /)
     |      Return self+value.
     |  
     |  __delitem__(self, key, /)
     |      Delete self[key].
     |  
     |  __eq__(self, value, /)
     |      Return self==value.
     |  
     |  __float__(self, /)
     |      float(self)
     |  
     |  __floordiv__(self, value, /)
     |      Return self//value.
     |  
     |  __ge__(self, value, /)
     |      Return self>=value.
     |  
     |  __getitem__(self, key, /)
     |      Return self[key].
     |  
     |  __gt__(self, value, /)
     |      Return self>value.
     |  
     |  __index__(self, /)
     |      Return self converted to an integer, if self is suitable for use as an index into a list.
     |  
     |  __init__(self, /, *args, **kwargs)
     |      Initialize self.  See help(type(self)) for accurate signature.
     |  
     |  __int__(self, /)
     |      int(self)
     |  
     |  __invert__(self, /)
     |      ~self
     |  
     |  __le__(self, value, /)
     |      Return self<=value.
     |  
     |  __len__(self, /)
     |      Return len(self).
     |  
     |  __lt__(self, value, /)
     |      Return self<value.
     |  
     |  __mod__(self, value, /)
     |      Return self%value.
     |  
     |  __mul__(self, value, /)
     |      Return self*value.
     |  
     |  __ne__(self, value, /)
     |      Return self!=value.
     |  
     |  __radd__(self, value, /)
     |      Return value+self.
     |  
     |  __repr__(self, /)
     |      Return repr(self).
     |  
     |  __rfloordiv__(self, value, /)
     |      Return value//self.
     |  
     |  __rmod__(self, value, /)
     |      Return value%self.
     |  
     |  __rmul__(self, value, /)
     |      Return value*self.
     |  
     |  __rsub__(self, value, /)
     |      Return value-self.
     |  
     |  __setitem__(self, key, value, /)
     |      Set self[key] to value.
     |  
     |  __sub__(self, value, /)
     |      Return self-value.
     |  
     |  correct_gamma(...)
     |      correct_gamma (gamma) -> Color
     |      Applies a certain gamma value to the Color.
     |  
     |  lerp(...)
     |      lerp(Color, float) -> Color
     |      returns a linear interpolation to the given Color.
     |  
     |  normalize(...)
     |      normalize() -> tuple
     |      Returns the normalized RGBA values of the Color.
     |  
     |  premul_alpha(...)
     |      premul_alpha() -> Color
     |      returns a Color where the r,g,b components have been multiplied by the alpha.
     |  
     |  set_length(...)
     |      set_length(len) -> None
     |      Set the number of elements in the Color to 1,2,3, or 4.
     |  
     |  update(...)
     |      update(r, g, b) -> None
     |      update(r, g, b, a=255) -> None
     |      update(color_value) -> None
     |      Sets the elements of the color
     |  
     |  ----------------------------------------------------------------------
     |  Static methods defined here:
     |  
     |  __new__(*args, **kwargs) from builtins.type
     |      Create and return a new object.  See help(type) for accurate signature.
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors defined here:
     |  
     |  __array_struct__
     |      array structure interface, read only
     |  
     |  a
     |      a -> int
     |      Gets or sets the alpha value of the Color.
     |  
     |  b
     |      b -> int
     |      Gets or sets the blue value of the Color.
     |  
     |  cmy
     |      cmy -> tuple
     |      Gets or sets the CMY representation of the Color.
     |  
     |  g
     |      g -> int
     |      Gets or sets the green value of the Color.
     |  
     |  hsla
     |      hsla -> tuple
     |      Gets or sets the HSLA representation of the Color.
     |  
     |  hsva
     |      hsva -> tuple
     |      Gets or sets the HSVA representation of the Color.
     |  
     |  i1i2i3
     |      i1i2i3 -> tuple
     |      Gets or sets the I1I2I3 representation of the Color.
     |  
     |  r
     |      r -> int
     |      Gets or sets the red value of the Color.
     |  
     |  ----------------------------------------------------------------------
     |  Data and other attributes defined here:
     |  
     |  __hash__ = None
    
    class PixelArray(builtins.object)
     |  PixelArray(Surface) -> PixelArray
     |  pygame object for direct pixel access of surfaces
     |  
     |  Methods defined here:
     |  
     |  __contains__(self, key, /)
     |      Return key in self.
     |  
     |  __delitem__(self, key, /)
     |      Delete self[key].
     |  
     |  __enter__(...)
     |      transpose() -> PixelArray
     |      Closes the PixelArray, and releases Surface lock.
     |  
     |  __exit__(...)
     |      extract(color, distance=0, weights=(0.299, 0.587, 0.114)) -> PixelArray
     |      Extracts the passed color from the PixelArray.
     |  
     |  __getitem__(self, key, /)
     |      Return self[key].
     |  
     |  __iter__(self, /)
     |      Implement iter(self).
     |  
     |  __len__(self, /)
     |      Return len(self).
     |  
     |  __repr__(self, /)
     |      Return repr(self).
     |  
     |  __setitem__(self, key, value, /)
     |      Set self[key] to value.
     |  
     |  close(...)
     |      transpose() -> PixelArray
     |      Closes the PixelArray, and releases Surface lock.
     |  
     |  compare(...)
     |      compare(array, distance=0, weights=(0.299, 0.587, 0.114)) -> PixelArray
     |      Compares the PixelArray with another one.
     |  
     |  extract(...)
     |      extract(color, distance=0, weights=(0.299, 0.587, 0.114)) -> PixelArray
     |      Extracts the passed color from the PixelArray.
     |  
     |  make_surface(...)
     |      make_surface() -> Surface
     |      Creates a new Surface from the current PixelArray.
     |  
     |  replace(...)
     |      replace(color, repcolor, distance=0, weights=(0.299, 0.587, 0.114)) -> None
     |      Replaces the passed color in the PixelArray with another one.
     |  
     |  transpose(...)
     |      transpose() -> PixelArray
     |      Exchanges the x and y axis.
     |  
     |  ----------------------------------------------------------------------
     |  Static methods defined here:
     |  
     |  __new__(*args, **kwargs) from builtins.type
     |      Create and return a new object.  See help(type) for accurate signature.
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors defined here:
     |  
     |  __array_interface__
     |      Version 3
     |  
     |  __array_struct__
     |      Version 3
     |  
     |  __dict__
     |  
     |  itemsize
     |      itemsize -> int
     |      Returns the byte size of a pixel array item
     |  
     |  ndim
     |      ndim -> int
     |      Returns the number of dimensions.
     |  
     |  shape
     |      shape -> tuple of int's
     |      Returns the array size.
     |  
     |  strides
     |      strides -> tuple of int's
     |      Returns byte offsets for each array dimension.
     |  
     |  surface
     |      surface -> Surface
     |      Gets the Surface the PixelArray uses.
    
    class Rect(builtins.object)
     |  Rect(left, top, width, height) -> Rect
     |  Rect((left, top), (width, height)) -> Rect
     |  Rect(object) -> Rect
     |  pygame object for storing rectangular coordinates
     |  
     |  Methods defined here:
     |  
     |  __bool__(self, /)
     |      self != 0
     |  
     |  __copy__(...)
     |  
     |  __delitem__(self, key, /)
     |      Delete self[key].
     |  
     |  __eq__(self, value, /)
     |      Return self==value.
     |  
     |  __ge__(self, value, /)
     |      Return self>=value.
     |  
     |  __getitem__(self, key, /)
     |      Return self[key].
     |  
     |  __gt__(self, value, /)
     |      Return self>value.
     |  
     |  __init__(self, /, *args, **kwargs)
     |      Initialize self.  See help(type(self)) for accurate signature.
     |  
     |  __le__(self, value, /)
     |      Return self<=value.
     |  
     |  __len__(self, /)
     |      Return len(self).
     |  
     |  __lt__(self, value, /)
     |      Return self<value.
     |  
     |  __ne__(self, value, /)
     |      Return self!=value.
     |  
     |  __reduce__(...)
     |      Helper for pickle.
     |  
     |  __repr__(self, /)
     |      Return repr(self).
     |  
     |  __setitem__(self, key, value, /)
     |      Set self[key] to value.
     |  
     |  __str__(self, /)
     |      Return str(self).
     |  
     |  clamp(...)
     |      clamp(Rect) -> Rect
     |      moves the rectangle inside another
     |  
     |  clamp_ip(...)
     |      clamp_ip(Rect) -> None
     |      moves the rectangle inside another, in place
     |  
     |  clip(...)
     |      clip(Rect) -> Rect
     |      crops a rectangle inside another
     |  
     |  clipline(...)
     |      clipline(x1, y1, x2, y2) -> ((cx1, cy1), (cx2, cy2))
     |      clipline(x1, y1, x2, y2) -> ()
     |      clipline((x1, y1), (x2, y2)) -> ((cx1, cy1), (cx2, cy2))
     |      clipline((x1, y1), (x2, y2)) -> ()
     |      clipline((x1, y1, x2, y2)) -> ((cx1, cy1), (cx2, cy2))
     |      clipline((x1, y1, x2, y2)) -> ()
     |      clipline(((x1, y1), (x2, y2))) -> ((cx1, cy1), (cx2, cy2))
     |      clipline(((x1, y1), (x2, y2))) -> ()
     |      crops a line inside a rectangle
     |  
     |  collidedict(...)
     |      collidedict(dict) -> (key, value)
     |      collidedict(dict) -> None
     |      collidedict(dict, use_values=0) -> (key, value)
     |      collidedict(dict, use_values=0) -> None
     |      test if one rectangle in a dictionary intersects
     |  
     |  collidedictall(...)
     |      collidedictall(dict) -> [(key, value), ...]
     |      collidedictall(dict, use_values=0) -> [(key, value), ...]
     |      test if all rectangles in a dictionary intersect
     |  
     |  collidelist(...)
     |      collidelist(list) -> index
     |      test if one rectangle in a list intersects
     |  
     |  collidelistall(...)
     |      collidelistall(list) -> indices
     |      test if all rectangles in a list intersect
     |  
     |  collidepoint(...)
     |      collidepoint(x, y) -> bool
     |      collidepoint((x,y)) -> bool
     |      test if a point is inside a rectangle
     |  
     |  colliderect(...)
     |      colliderect(Rect) -> bool
     |      test if two rectangles overlap
     |  
     |  contains(...)
     |      contains(Rect) -> bool
     |      test if one rectangle is inside another
     |  
     |  copy(...)
     |      copy() -> Rect
     |      copy the rectangle
     |  
     |  fit(...)
     |      fit(Rect) -> Rect
     |      resize and move a rectangle with aspect ratio
     |  
     |  inflate(...)
     |      inflate(x, y) -> Rect
     |      grow or shrink the rectangle size
     |  
     |  inflate_ip(...)
     |      inflate_ip(x, y) -> None
     |      grow or shrink the rectangle size, in place
     |  
     |  move(...)
     |      move(x, y) -> Rect
     |      moves the rectangle
     |  
     |  move_ip(...)
     |      move_ip(x, y) -> None
     |      moves the rectangle, in place
     |  
     |  normalize(...)
     |      normalize() -> None
     |      correct negative sizes
     |  
     |  union(...)
     |      union(Rect) -> Rect
     |      joins two rectangles into one
     |  
     |  union_ip(...)
     |      union_ip(Rect) -> None
     |      joins two rectangles into one, in place
     |  
     |  unionall(...)
     |      unionall(Rect_sequence) -> Rect
     |      the union of many rectangles
     |  
     |  unionall_ip(...)
     |      unionall_ip(Rect_sequence) -> None
     |      the union of many rectangles, in place
     |  
     |  update(...)
     |      update(left, top, width, height) -> None
     |      update((left, top), (width, height)) -> None
     |      update(object) -> None
     |      sets the position and size of the rectangle
     |  
     |  ----------------------------------------------------------------------
     |  Static methods defined here:
     |  
     |  __new__(*args, **kwargs) from builtins.type
     |      Create and return a new object.  See help(type) for accurate signature.
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors defined here:
     |  
     |  __safe_for_unpickling__
     |  
     |  bottom
     |  
     |  bottomleft
     |  
     |  bottomright
     |  
     |  center
     |  
     |  centerx
     |  
     |  centery
     |  
     |  h
     |  
     |  height
     |  
     |  left
     |  
     |  midbottom
     |  
     |  midleft
     |  
     |  midright
     |  
     |  midtop
     |  
     |  right
     |  
     |  size
     |  
     |  top
     |  
     |  topleft
     |  
     |  topright
     |  
     |  w
     |  
     |  width
     |  
     |  x
     |  
     |  y
     |  
     |  ----------------------------------------------------------------------
     |  Data and other attributes defined here:
     |  
     |  __hash__ = None
    
    class Surface(builtins.object)
     |  Surface((width, height), flags=0, depth=0, masks=None) -> Surface
     |  Surface((width, height), flags=0, Surface) -> Surface
     |  pygame object for representing images
     |  
     |  Methods defined here:
     |  
     |  __copy__(...)
     |      copy() -> Surface
     |      create a new copy of a Surface
     |  
     |  __init__(self, /, *args, **kwargs)
     |      Initialize self.  See help(type(self)) for accurate signature.
     |  
     |  __repr__(self, /)
     |      Return repr(self).
     |  
     |  blit(...)
     |      blit(source, dest, area=None, special_flags=0) -> Rect
     |      draw one image onto another
     |  
     |  blits(...)
     |      blits(blit_sequence=(source, dest), ...), doreturn=1) -> [Rect, ...] or None
     |      blits((source, dest, area), ...)) -> [Rect, ...]
     |      blits((source, dest, area, special_flags), ...)) -> [Rect, ...]
     |      draw many images onto another
     |  
     |  convert(...)
     |      convert(Surface=None) -> Surface
     |      convert(depth, flags=0) -> Surface
     |      convert(masks, flags=0) -> Surface
     |      change the pixel format of an image
     |  
     |  convert_alpha(...)
     |      convert_alpha(Surface) -> Surface
     |      convert_alpha() -> Surface
     |      change the pixel format of an image including per pixel alphas
     |  
     |  copy(...)
     |      copy() -> Surface
     |      create a new copy of a Surface
     |  
     |  fill(...)
     |      fill(color, rect=None, special_flags=0) -> Rect
     |      fill Surface with a solid color
     |  
     |  get_abs_offset(...)
     |      get_abs_offset() -> (x, y)
     |      find the absolute position of a child subsurface inside its top level parent
     |  
     |  get_abs_parent(...)
     |      get_abs_parent() -> Surface
     |      find the top level parent of a subsurface
     |  
     |  get_alpha(...)
     |      get_alpha() -> int_value
     |      get the current Surface transparency value
     |  
     |  get_at(...)
     |      get_at((x, y)) -> Color
     |      get the color value at a single pixel
     |  
     |  get_at_mapped(...)
     |      get_at_mapped((x, y)) -> Color
     |      get the mapped color value at a single pixel
     |  
     |  get_bitsize(...)
     |      get_bitsize() -> int
     |      get the bit depth of the Surface pixel format
     |  
     |  get_blendmode(...)
     |      Return the surface's SDL 2 blend mode
     |  
     |  get_bounding_rect(...)
     |      get_bounding_rect(min_alpha = 1) -> Rect
     |      find the smallest rect containing data
     |  
     |  get_buffer(...)
     |      get_buffer() -> BufferProxy
     |      acquires a buffer object for the pixels of the Surface.
     |  
     |  get_bytesize(...)
     |      get_bytesize() -> int
     |      get the bytes used per Surface pixel
     |  
     |  get_clip(...)
     |      get_clip() -> Rect
     |      get the current clipping area of the Surface
     |  
     |  get_colorkey(...)
     |      get_colorkey() -> RGB or None
     |      Get the current transparent colorkey
     |  
     |  get_flags(...)
     |      get_flags() -> int
     |      get the additional flags used for the Surface
     |  
     |  get_height(...)
     |      get_height() -> height
     |      get the height of the Surface
     |  
     |  get_locked(...)
     |      get_locked() -> bool
     |      test if the Surface is current locked
     |  
     |  get_locks(...)
     |      get_locks() -> tuple
     |      Gets the locks for the Surface
     |  
     |  get_losses(...)
     |      get_losses() -> (R, G, B, A)
     |      the significant bits used to convert between a color and a mapped integer
     |  
     |  get_masks(...)
     |      get_masks() -> (R, G, B, A)
     |      the bitmasks needed to convert between a color and a mapped integer
     |  
     |  get_offset(...)
     |      get_offset() -> (x, y)
     |      find the position of a child subsurface inside a parent
     |  
     |  get_palette(...)
     |      get_palette() -> [RGB, RGB, RGB, ...]
     |      get the color index palette for an 8-bit Surface
     |  
     |  get_palette_at(...)
     |      get_palette_at(index) -> RGB
     |      get the color for a single entry in a palette
     |  
     |  get_parent(...)
     |      get_parent() -> Surface
     |      find the parent of a subsurface
     |  
     |  get_pitch(...)
     |      get_pitch() -> int
     |      get the number of bytes used per Surface row
     |  
     |  get_rect(...)
     |      get_rect(**kwargs) -> Rect
     |      get the rectangular area of the Surface
     |  
     |  get_shifts(...)
     |      get_shifts() -> (R, G, B, A)
     |      the bit shifts needed to convert between a color and a mapped integer
     |  
     |  get_size(...)
     |      get_size() -> (width, height)
     |      get the dimensions of the Surface
     |  
     |  get_view(...)
     |      get_view(<kind>='2') -> BufferProxy
     |      return a buffer view of the Surface's pixels.
     |  
     |  get_width(...)
     |      get_width() -> width
     |      get the width of the Surface
     |  
     |  lock(...)
     |      lock() -> None
     |      lock the Surface memory for pixel access
     |  
     |  map_rgb(...)
     |      map_rgb(Color) -> mapped_int
     |      convert a color into a mapped color value
     |  
     |  mustlock(...)
     |      mustlock() -> bool
     |      test if the Surface requires locking
     |  
     |  scroll(...)
     |      scroll(dx=0, dy=0) -> None
     |      Shift the surface image in place
     |  
     |  set_alpha(...)
     |      set_alpha(value, flags=0) -> None
     |      set_alpha(None) -> None
     |      set the alpha value for the full Surface image
     |  
     |  set_at(...)
     |      set_at((x, y), Color) -> None
     |      set the color value for a single pixel
     |  
     |  set_clip(...)
     |      set_clip(rect) -> None
     |      set_clip(None) -> None
     |      set the current clipping area of the Surface
     |  
     |  set_colorkey(...)
     |      set_colorkey(Color, flags=0) -> None
     |      set_colorkey(None) -> None
     |      Set the transparent colorkey
     |  
     |  set_masks(...)
     |      set_masks((r,g,b,a)) -> None
     |      set the bitmasks needed to convert between a color and a mapped integer
     |  
     |  set_palette(...)
     |      set_palette([RGB, RGB, RGB, ...]) -> None
     |      set the color palette for an 8-bit Surface
     |  
     |  set_palette_at(...)
     |      set_palette_at(index, RGB) -> None
     |      set the color for a single index in an 8-bit Surface palette
     |  
     |  set_shifts(...)
     |      set_shifts((r,g,b,a)) -> None
     |      sets the bit shifts needed to convert between a color and a mapped integer
     |  
     |  subsurface(...)
     |      subsurface(Rect) -> Surface
     |      create a new surface that references its parent
     |  
     |  unlock(...)
     |      unlock() -> None
     |      unlock the Surface memory from pixel access
     |  
     |  unmap_rgb(...)
     |      unmap_rgb(mapped_int) -> Color
     |      convert a mapped integer color value into a Color
     |  
     |  ----------------------------------------------------------------------
     |  Static methods defined here:
     |  
     |  __new__(*args, **kwargs) from builtins.type
     |      Create and return a new object.  See help(type) for accurate signature.
    
    SurfaceType = class Surface(builtins.object)
     |  Surface((width, height), flags=0, depth=0, masks=None) -> Surface
     |  Surface((width, height), flags=0, Surface) -> Surface
     |  pygame object for representing images
     |  
     |  Methods defined here:
     |  
     |  __copy__(...)
     |      copy() -> Surface
     |      create a new copy of a Surface
     |  
     |  __init__(self, /, *args, **kwargs)
     |      Initialize self.  See help(type(self)) for accurate signature.
     |  
     |  __repr__(self, /)
     |      Return repr(self).
     |  
     |  blit(...)
     |      blit(source, dest, area=None, special_flags=0) -> Rect
     |      draw one image onto another
     |  
     |  blits(...)
     |      blits(blit_sequence=(source, dest), ...), doreturn=1) -> [Rect, ...] or None
     |      blits((source, dest, area), ...)) -> [Rect, ...]
     |      blits((source, dest, area, special_flags), ...)) -> [Rect, ...]
     |      draw many images onto another
     |  
     |  convert(...)
     |      convert(Surface=None) -> Surface
     |      convert(depth, flags=0) -> Surface
     |      convert(masks, flags=0) -> Surface
     |      change the pixel format of an image
     |  
     |  convert_alpha(...)
     |      convert_alpha(Surface) -> Surface
     |      convert_alpha() -> Surface
     |      change the pixel format of an image including per pixel alphas
     |  
     |  copy(...)
     |      copy() -> Surface
     |      create a new copy of a Surface
     |  
     |  fill(...)
     |      fill(color, rect=None, special_flags=0) -> Rect
     |      fill Surface with a solid color
     |  
     |  get_abs_offset(...)
     |      get_abs_offset() -> (x, y)
     |      find the absolute position of a child subsurface inside its top level parent
     |  
     |  get_abs_parent(...)
     |      get_abs_parent() -> Surface
     |      find the top level parent of a subsurface
     |  
     |  get_alpha(...)
     |      get_alpha() -> int_value
     |      get the current Surface transparency value
     |  
     |  get_at(...)
     |      get_at((x, y)) -> Color
     |      get the color value at a single pixel
     |  
     |  get_at_mapped(...)
     |      get_at_mapped((x, y)) -> Color
     |      get the mapped color value at a single pixel
     |  
     |  get_bitsize(...)
     |      get_bitsize() -> int
     |      get the bit depth of the Surface pixel format
     |  
     |  get_blendmode(...)
     |      Return the surface's SDL 2 blend mode
     |  
     |  get_bounding_rect(...)
     |      get_bounding_rect(min_alpha = 1) -> Rect
     |      find the smallest rect containing data
     |  
     |  get_buffer(...)
     |      get_buffer() -> BufferProxy
     |      acquires a buffer object for the pixels of the Surface.
     |  
     |  get_bytesize(...)
     |      get_bytesize() -> int
     |      get the bytes used per Surface pixel
     |  
     |  get_clip(...)
     |      get_clip() -> Rect
     |      get the current clipping area of the Surface
     |  
     |  get_colorkey(...)
     |      get_colorkey() -> RGB or None
     |      Get the current transparent colorkey
     |  
     |  get_flags(...)
     |      get_flags() -> int
     |      get the additional flags used for the Surface
     |  
     |  get_height(...)
     |      get_height() -> height
     |      get the height of the Surface
     |  
     |  get_locked(...)
     |      get_locked() -> bool
     |      test if the Surface is current locked
     |  
     |  get_locks(...)
     |      get_locks() -> tuple
     |      Gets the locks for the Surface
     |  
     |  get_losses(...)
     |      get_losses() -> (R, G, B, A)
     |      the significant bits used to convert between a color and a mapped integer
     |  
     |  get_masks(...)
     |      get_masks() -> (R, G, B, A)
     |      the bitmasks needed to convert between a color and a mapped integer
     |  
     |  get_offset(...)
     |      get_offset() -> (x, y)
     |      find the position of a child subsurface inside a parent
     |  
     |  get_palette(...)
     |      get_palette() -> [RGB, RGB, RGB, ...]
     |      get the color index palette for an 8-bit Surface
     |  
     |  get_palette_at(...)
     |      get_palette_at(index) -> RGB
     |      get the color for a single entry in a palette
     |  
     |  get_parent(...)
     |      get_parent() -> Surface
     |      find the parent of a subsurface
     |  
     |  get_pitch(...)
     |      get_pitch() -> int
     |      get the number of bytes used per Surface row
     |  
     |  get_rect(...)
     |      get_rect(**kwargs) -> Rect
     |      get the rectangular area of the Surface
     |  
     |  get_shifts(...)
     |      get_shifts() -> (R, G, B, A)
     |      the bit shifts needed to convert between a color and a mapped integer
     |  
     |  get_size(...)
     |      get_size() -> (width, height)
     |      get the dimensions of the Surface
     |  
     |  get_view(...)
     |      get_view(<kind>='2') -> BufferProxy
     |      return a buffer view of the Surface's pixels.
     |  
     |  get_width(...)
     |      get_width() -> width
     |      get the width of the Surface
     |  
     |  lock(...)
     |      lock() -> None
     |      lock the Surface memory for pixel access
     |  
     |  map_rgb(...)
     |      map_rgb(Color) -> mapped_int
     |      convert a color into a mapped color value
     |  
     |  mustlock(...)
     |      mustlock() -> bool
     |      test if the Surface requires locking
     |  
     |  scroll(...)
     |      scroll(dx=0, dy=0) -> None
     |      Shift the surface image in place
     |  
     |  set_alpha(...)
     |      set_alpha(value, flags=0) -> None
     |      set_alpha(None) -> None
     |      set the alpha value for the full Surface image
     |  
     |  set_at(...)
     |      set_at((x, y), Color) -> None
     |      set the color value for a single pixel
     |  
     |  set_clip(...)
     |      set_clip(rect) -> None
     |      set_clip(None) -> None
     |      set the current clipping area of the Surface
     |  
     |  set_colorkey(...)
     |      set_colorkey(Color, flags=0) -> None
     |      set_colorkey(None) -> None
     |      Set the transparent colorkey
     |  
     |  set_masks(...)
     |      set_masks((r,g,b,a)) -> None
     |      set the bitmasks needed to convert between a color and a mapped integer
     |  
     |  set_palette(...)
     |      set_palette([RGB, RGB, RGB, ...]) -> None
     |      set the color palette for an 8-bit Surface
     |  
     |  set_palette_at(...)
     |      set_palette_at(index, RGB) -> None
     |      set the color for a single index in an 8-bit Surface palette
     |  
     |  set_shifts(...)
     |      set_shifts((r,g,b,a)) -> None
     |      sets the bit shifts needed to convert between a color and a mapped integer
     |  
     |  subsurface(...)
     |      subsurface(Rect) -> Surface
     |      create a new surface that references its parent
     |  
     |  unlock(...)
     |      unlock() -> None
     |      unlock the Surface memory from pixel access
     |  
     |  unmap_rgb(...)
     |      unmap_rgb(mapped_int) -> Color
     |      convert a mapped integer color value into a Color
     |  
     |  ----------------------------------------------------------------------
     |  Static methods defined here:
     |  
     |  __new__(*args, **kwargs) from builtins.type
     |      Create and return a new object.  See help(type) for accurate signature.
    
    class error(builtins.RuntimeError)
     |  Unspecified run-time error.
     |  
     |  Method resolution order:
     |      error
     |      builtins.RuntimeError
     |      builtins.Exception
     |      builtins.BaseException
     |      builtins.object
     |  
     |  Data descriptors defined here:
     |  
     |  __weakref__
     |      list of weak references to the object (if defined)
     |  
     |  ----------------------------------------------------------------------
     |  Methods inherited from builtins.RuntimeError:
     |  
     |  __init__(self, /, *args, **kwargs)
     |      Initialize self.  See help(type(self)) for accurate signature.
     |  
     |  ----------------------------------------------------------------------
     |  Static methods inherited from builtins.RuntimeError:
     |  
     |  __new__(*args, **kwargs) from builtins.type
     |      Create and return a new object.  See help(type) for accurate signature.
     |  
     |  ----------------------------------------------------------------------
     |  Methods inherited from builtins.BaseException:
     |  
     |  __delattr__(self, name, /)
     |      Implement delattr(self, name).
     |  
     |  __getattribute__(self, name, /)
     |      Return getattr(self, name).
     |  
     |  __reduce__(...)
     |      Helper for pickle.
     |  
     |  __repr__(self, /)
     |      Return repr(self).
     |  
     |  __setattr__(self, name, value, /)
     |      Implement setattr(self, name, value).
     |  
     |  __setstate__(...)
     |  
     |  __str__(self, /)
     |      Return str(self).
     |  
     |  with_traceback(...)
     |      Exception.with_traceback(tb) --
     |      set self.__traceback__ to tb and return self.
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors inherited from builtins.BaseException:
     |  
     |  __cause__
     |      exception cause
     |  
     |  __context__
     |      exception context
     |  
     |  __dict__
     |  
     |  __suppress_context__
     |  
     |  __traceback__
     |  
     |  args

FUNCTIONS
    Overlay lambda (...)
    
    encode_file_path(...)
        encode_file_path([obj [, etype]]) -> bytes or None
        Encode a Unicode or bytes object as a file system path
    
    encode_string(...)
        encode_string([obj [, encoding [, errors [, etype]]]]) -> bytes or None
        Encode a Unicode or bytes object
    
    get_array_interface(...)
        return an array struct interface as an interface dictionary
    
    get_error(...)
        get_error() -> errorstr
        get the current error message
    
    get_init(...)
        get_init() -> bool
        returns True if pygame is currently initialized
    
    get_sdl_byteorder(...)
        get_sdl_byteorder() -> int
        get the byte order of SDL
    
    get_sdl_version(...)
        get_sdl_version() -> major, minor, patch
        get the version number of SDL
    
    init(...)
        init() -> (numpass, numfail)
        initialize all imported pygame modules
    
    packager_imports()
        some additional imports that py2app/py2exe will want to see
    
    quit(...)
        quit() -> None
        uninitialize all pygame modules
    
    register_quit(...)
        register_quit(callable) -> None
        register a function to be called when pygame quits
    
    segfault(...)
        crash
    
    set_error(...)
        set_error(error_msg) -> None
        set the current error message
    
    warn_unwanted_files()
        warn about unneeded old files

DATA
    ACTIVEEVENT = 32768
    ANYFORMAT = 268435456
    APPACTIVE = 2
    APPFOCUSMOUSE = 0
    APPINPUTFOCUS = 1
    ASYNCBLIT = 4
    AUDIODEVICEADDED = 4352
    AUDIODEVICEREMOVED = 4353
    AUDIO_ALLOW_ANY_CHANGE = 15
    AUDIO_ALLOW_CHANNELS_CHANGE = 4
    AUDIO_ALLOW_FORMAT_CHANGE = 2
    AUDIO_ALLOW_FREQUENCY_CHANGE = 1
    AUDIO_S16 = 32784
    AUDIO_S16LSB = 32784
    AUDIO_S16MSB = 36880
    AUDIO_S16SYS = 32784
    AUDIO_S8 = 32776
    AUDIO_U16 = 16
    AUDIO_U16LSB = 16
    AUDIO_U16MSB = 4112
    AUDIO_U16SYS = 16
    AUDIO_U8 = 8
    BIG_ENDIAN = 4321
    BLENDMODE_ADD = 2
    BLENDMODE_BLEND = 1
    BLENDMODE_MOD = 4
    BLENDMODE_NONE = 0
    BLEND_ADD = 1
    BLEND_ALPHA_SDL2 = 18
    BLEND_MAX = 5
    BLEND_MIN = 4
    BLEND_MULT = 3
    BLEND_PREMULTIPLIED = 17
    BLEND_RGBA_ADD = 6
    BLEND_RGBA_MAX = 16
    BLEND_RGBA_MIN = 9
    BLEND_RGBA_MULT = 8
    BLEND_RGBA_SUB = 7
    BLEND_RGB_ADD = 1
    BLEND_RGB_MAX = 5
    BLEND_RGB_MIN = 4
    BLEND_RGB_MULT = 3
    BLEND_RGB_SUB = 2
    BLEND_SUB = 2
    BUTTON_LEFT = 1
    BUTTON_MIDDLE = 2
    BUTTON_RIGHT = 3
    BUTTON_WHEELDOWN = 5
    BUTTON_WHEELUP = 4
    BUTTON_X1 = 6
    BUTTON_X2 = 7
    CONTROLLERAXISMOTION = 1616
    CONTROLLERBUTTONDOWN = 1617
    CONTROLLERBUTTONUP = 1618
    CONTROLLERDEVICEADDED = 1619
    CONTROLLERDEVICEREMAPPED = 1621
    CONTROLLERDEVICEREMOVED = 1620
    CONTROLLER_AXIS_INVALID = -1
    CONTROLLER_AXIS_LEFTX = 0
    CONTROLLER_AXIS_LEFTY = 1
    CONTROLLER_AXIS_MAX = 6
    CONTROLLER_AXIS_RIGHTX = 2
    CONTROLLER_AXIS_RIGHTY = 3
    CONTROLLER_AXIS_TRIGGERLEFT = 4
    CONTROLLER_AXIS_TRIGGERRIGHT = 5
    CONTROLLER_BUTTON_A = 0
    CONTROLLER_BUTTON_B = 1
    CONTROLLER_BUTTON_BACK = 4
    CONTROLLER_BUTTON_DPAD_DOWN = 12
    CONTROLLER_BUTTON_DPAD_LEFT = 13
    CONTROLLER_BUTTON_DPAD_RIGHT = 14
    CONTROLLER_BUTTON_DPAD_UP = 11
    CONTROLLER_BUTTON_GUIDE = 5
    CONTROLLER_BUTTON_INVALID = -1
    CONTROLLER_BUTTON_LEFTSHOULDER = 9
    CONTROLLER_BUTTON_LEFTSTICK = 7
    CONTROLLER_BUTTON_MAX = 21
    CONTROLLER_BUTTON_RIGHTSHOULDER = 10
    CONTROLLER_BUTTON_RIGHTSTICK = 8
    CONTROLLER_BUTTON_START = 6
    CONTROLLER_BUTTON_X = 2
    CONTROLLER_BUTTON_Y = 3
    DOUBLEBUF = 1073741824
    DROPBEGIN = 4098
    DROPCOMPLETE = 4099
    DROPFILE = 4096
    DROPTEXT = 4097
    FINGERDOWN = 1792
    FINGERMOTION = 1794
    FINGERUP = 1793
    FULLSCREEN = -2147483648
    GL_ACCELERATED_VISUAL = 15
    GL_ACCUM_ALPHA_SIZE = 11
    GL_ACCUM_BLUE_SIZE = 10
    GL_ACCUM_GREEN_SIZE = 9
    GL_ACCUM_RED_SIZE = 8
    GL_ALPHA_SIZE = 3
    GL_BLUE_SIZE = 2
    GL_BUFFER_SIZE = 4
    GL_CONTEXT_DEBUG_FLAG = 1
    GL_CONTEXT_FLAGS = 20
    GL_CONTEXT_FORWARD_COMPATIBLE_FLAG = 2
    GL_CONTEXT_MAJOR_VERSION = 17
    GL_CONTEXT_MINOR_VERSION = 18
    GL_CONTEXT_PROFILE_COMPATIBILITY = 2
    GL_CONTEXT_PROFILE_CORE = 1
    GL_CONTEXT_PROFILE_ES = 4
    GL_CONTEXT_PROFILE_MASK = 21
    GL_CONTEXT_RELEASE_BEHAVIOR = 24
    GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 1
    GL_CONTEXT_RELEASE_BEHAVIOR_NONE = 0
    GL_CONTEXT_RESET_ISOLATION_FLAG = 8
    GL_CONTEXT_ROBUST_ACCESS_FLAG = 4
    GL_DEPTH_SIZE = 6
    GL_DOUBLEBUFFER = 5
    GL_FRAMEBUFFER_SRGB_CAPABLE = 23
    GL_GREEN_SIZE = 1
    GL_MULTISAMPLEBUFFERS = 13
    GL_MULTISAMPLESAMPLES = 14
    GL_RED_SIZE = 0
    GL_SHARE_WITH_CURRENT_CONTEXT = 22
    GL_STENCIL_SIZE = 7
    GL_STEREO = 12
    GL_SWAP_CONTROL = 0
    HAT_CENTERED = 0
    HAT_DOWN = 4
    HAT_LEFT = 8
    HAT_LEFTDOWN = 12
    HAT_LEFTUP = 9
    HAT_RIGHT = 2
    HAT_RIGHTDOWN = 6
    HAT_RIGHTUP = 3
    HAT_UP = 1
    HAVE_NEWBUF = 1
    HIDDEN = 128
    HWACCEL = 256
    HWPALETTE = 536870912
    HWSURFACE = 1
    JOYAXISMOTION = 1536
    JOYBALLMOTION = 1537
    JOYBUTTONDOWN = 1539
    JOYBUTTONUP = 1540
    JOYDEVICEADDED = 1541
    JOYDEVICEREMOVED = 1542
    JOYHATMOTION = 1538
    KEYDOWN = 768
    KEYUP = 769
    KMOD_ALT = 768
    KMOD_CAPS = 8192
    KMOD_CTRL = 192
    KMOD_GUI = 3072
    KMOD_LALT = 256
    KMOD_LCTRL = 64
    KMOD_LGUI = 1024
    KMOD_LMETA = 1024
    KMOD_LSHIFT = 1
    KMOD_META = 3072
    KMOD_MODE = 16384
    KMOD_NONE = 0
    KMOD_NUM = 4096
    KMOD_RALT = 512
    KMOD_RCTRL = 128
    KMOD_RGUI = 2048
    KMOD_RMETA = 2048
    KMOD_RSHIFT = 2
    KMOD_SHIFT = 3
    KSCAN_0 = 39
    KSCAN_1 = 30
    KSCAN_2 = 31
    KSCAN_3 = 32
    KSCAN_4 = 33
    KSCAN_5 = 34
    KSCAN_6 = 35
    KSCAN_7 = 36
    KSCAN_8 = 37
    KSCAN_9 = 38
    KSCAN_A = 4
    KSCAN_AC_BACK = 270
    KSCAN_APOSTROPHE = 52
    KSCAN_B = 5
    KSCAN_BACKSLASH = 49
    KSCAN_BACKSPACE = 42
    KSCAN_BREAK = 72
    KSCAN_C = 6
    KSCAN_CAPSLOCK = 57
    KSCAN_CLEAR = 156
    KSCAN_COMMA = 54
    KSCAN_CURRENCYSUBUNIT = 181
    KSCAN_CURRENCYUNIT = 180
    KSCAN_D = 7
    KSCAN_DELETE = 76
    KSCAN_DOWN = 81
    KSCAN_E = 8
    KSCAN_END = 77
    KSCAN_EQUALS = 46
    KSCAN_ESCAPE = 41
    KSCAN_EURO = 180
    KSCAN_F = 9
    KSCAN_F1 = 58
    KSCAN_F10 = 67
    KSCAN_F11 = 68
    KSCAN_F12 = 69
    KSCAN_F13 = 104
    KSCAN_F14 = 105
    KSCAN_F15 = 106
    KSCAN_F2 = 59
    KSCAN_F3 = 60
    KSCAN_F4 = 61
    KSCAN_F5 = 62
    KSCAN_F6 = 63
    KSCAN_F7 = 64
    KSCAN_F8 = 65
    KSCAN_F9 = 66
    KSCAN_G = 10
    KSCAN_GRAVE = 53
    KSCAN_H = 11
    KSCAN_HELP = 117
    KSCAN_HOME = 74
    KSCAN_I = 12
    KSCAN_INSERT = 73
    KSCAN_INTERNATIONAL1 = 135
    KSCAN_INTERNATIONAL2 = 136
    KSCAN_INTERNATIONAL3 = 137
    KSCAN_INTERNATIONAL4 = 138
    KSCAN_INTERNATIONAL5 = 139
    KSCAN_INTERNATIONAL6 = 140
    KSCAN_INTERNATIONAL7 = 141
    KSCAN_INTERNATIONAL8 = 142
    KSCAN_INTERNATIONAL9 = 143
    KSCAN_J = 13
    KSCAN_K = 14
    KSCAN_KP0 = 98
    KSCAN_KP1 = 89
    KSCAN_KP2 = 90
    KSCAN_KP3 = 91
    KSCAN_KP4 = 92
    KSCAN_KP5 = 93
    KSCAN_KP6 = 94
    KSCAN_KP7 = 95
    KSCAN_KP8 = 96
    KSCAN_KP9 = 97
    KSCAN_KP_0 = 98
    KSCAN_KP_1 = 89
    KSCAN_KP_2 = 90
    KSCAN_KP_3 = 91
    KSCAN_KP_4 = 92
    KSCAN_KP_5 = 93
    KSCAN_KP_6 = 94
    KSCAN_KP_7 = 95
    KSCAN_KP_8 = 96
    KSCAN_KP_9 = 97
    KSCAN_KP_DIVIDE = 84
    KSCAN_KP_ENTER = 88
    KSCAN_KP_EQUALS = 103
    KSCAN_KP_MINUS = 86
    KSCAN_KP_MULTIPLY = 85
    KSCAN_KP_PERIOD = 99
    KSCAN_KP_PLUS = 87
    KSCAN_L = 15
    KSCAN_LALT = 226
    KSCAN_LANG1 = 144
    KSCAN_LANG2 = 145
    KSCAN_LANG3 = 146
    KSCAN_LANG4 = 147
    KSCAN_LANG5 = 148
    KSCAN_LANG6 = 149
    KSCAN_LANG7 = 150
    KSCAN_LANG8 = 151
    KSCAN_LANG9 = 152
    KSCAN_LCTRL = 224
    KSCAN_LEFT = 80
    KSCAN_LEFTBRACKET = 47
    KSCAN_LGUI = 227
    KSCAN_LMETA = 227
    KSCAN_LSHIFT = 225
    KSCAN_LSUPER = 227
    KSCAN_M = 16
    KSCAN_MENU = 118
    KSCAN_MINUS = 45
    KSCAN_MODE = 257
    KSCAN_N = 17
    KSCAN_NONUSBACKSLASH = 100
    KSCAN_NONUSHASH = 50
    KSCAN_NUMLOCK = 83
    KSCAN_NUMLOCKCLEAR = 83
    KSCAN_O = 18
    KSCAN_P = 19
    KSCAN_PAGEDOWN = 78
    KSCAN_PAGEUP = 75
    KSCAN_PAUSE = 72
    KSCAN_PERIOD = 55
    KSCAN_POWER = 102
    KSCAN_PRINT = 70
    KSCAN_PRINTSCREEN = 70
    KSCAN_Q = 20
    KSCAN_R = 21
    KSCAN_RALT = 230
    KSCAN_RCTRL = 228
    KSCAN_RETURN = 40
    KSCAN_RGUI = 231
    KSCAN_RIGHT = 79
    KSCAN_RIGHTBRACKET = 48
    KSCAN_RMETA = 231
    KSCAN_RSHIFT = 229
    KSCAN_RSUPER = 231
    KSCAN_S = 22
    KSCAN_SCROLLLOCK = 71
    KSCAN_SCROLLOCK = 71
    KSCAN_SEMICOLON = 51
    KSCAN_SLASH = 56
    KSCAN_SPACE = 44
    KSCAN_SYSREQ = 154
    KSCAN_T = 23
    KSCAN_TAB = 43
    KSCAN_U = 24
    KSCAN_UNKNOWN = 0
    KSCAN_UP = 82
    KSCAN_V = 25
    KSCAN_W = 26
    KSCAN_X = 27
    KSCAN_Y = 28
    KSCAN_Z = 29
    K_0 = 48
    K_1 = 49
    K_2 = 50
    K_3 = 51
    K_4 = 52
    K_5 = 53
    K_6 = 54
    K_7 = 55
    K_8 = 56
    K_9 = 57
    K_AC_BACK = 1073742094
    K_AMPERSAND = 38
    K_ASTERISK = 42
    K_AT = 64
    K_BACKQUOTE = 96
    K_BACKSLASH = 92
    K_BACKSPACE = 8
    K_BREAK = 1073741896
    K_CAPSLOCK = 1073741881
    K_CARET = 94
    K_CLEAR = 1073741980
    K_COLON = 58
    K_COMMA = 44
    K_CURRENCYSUBUNIT = 1073742005
    K_CURRENCYUNIT = 1073742004
    K_DELETE = 127
    K_DOLLAR = 36
    K_DOWN = 1073741905
    K_END = 1073741901
    K_EQUALS = 61
    K_ESCAPE = 27
    K_EURO = 1073742004
    K_EXCLAIM = 33
    K_F1 = 1073741882
    K_F10 = 1073741891
    K_F11 = 1073741892
    K_F12 = 1073741893
    K_F13 = 1073741928
    K_F14 = 1073741929
    K_F15 = 1073741930
    K_F2 = 1073741883
    K_F3 = 1073741884
    K_F4 = 1073741885
    K_F5 = 1073741886
    K_F6 = 1073741887
    K_F7 = 1073741888
    K_F8 = 1073741889
    K_F9 = 1073741890
    K_GREATER = 62
    K_HASH = 35
    K_HELP = 1073741941
    K_HOME = 1073741898
    K_INSERT = 1073741897
    K_KP0 = 1073741922
    K_KP1 = 1073741913
    K_KP2 = 1073741914
    K_KP3 = 1073741915
    K_KP4 = 1073741916
    K_KP5 = 1073741917
    K_KP6 = 1073741918
    K_KP7 = 1073741919
    K_KP8 = 1073741920
    K_KP9 = 1073741921
    K_KP_0 = 1073741922
    K_KP_1 = 1073741913
    K_KP_2 = 1073741914
    K_KP_3 = 1073741915
    K_KP_4 = 1073741916
    K_KP_5 = 1073741917
    K_KP_6 = 1073741918
    K_KP_7 = 1073741919
    K_KP_8 = 1073741920
    K_KP_9 = 1073741921
    K_KP_DIVIDE = 1073741908
    K_KP_ENTER = 1073741912
    K_KP_EQUALS = 1073741927
    K_KP_MINUS = 1073741910
    K_KP_MULTIPLY = 1073741909
    K_KP_PERIOD = 1073741923
    K_KP_PLUS = 1073741911
    K_LALT = 1073742050
    K_LCTRL = 1073742048
    K_LEFT = 1073741904
    K_LEFTBRACKET = 91
    K_LEFTPAREN = 40
    K_LESS = 60
    K_LGUI = 1073742051
    K_LMETA = 1073742051
    K_LSHIFT = 1073742049
    K_LSUPER = 1073742051
    K_MENU = 1073741942
    K_MINUS = 45
    K_MODE = 1073742081
    K_NUMLOCK = 1073741907
    K_NUMLOCKCLEAR = 1073741907
    K_PAGEDOWN = 1073741902
    K_PAGEUP = 1073741899
    K_PAUSE = 1073741896
    K_PERCENT = 37
    K_PERIOD = 46
    K_PLUS = 43
    K_POWER = 1073741926
    K_PRINT = 1073741894
    K_PRINTSCREEN = 1073741894
    K_QUESTION = 63
    K_QUOTE = 39
    K_QUOTEDBL = 34
    K_RALT = 1073742054
    K_RCTRL = 1073742052
    K_RETURN = 13
    K_RGUI = 1073742055
    K_RIGHT = 1073741903
    K_RIGHTBRACKET = 93
    K_RIGHTPAREN = 41
    K_RMETA = 1073742055
    K_RSHIFT = 1073742053
    K_RSUPER = 1073742055
    K_SCROLLLOCK = 1073741895
    K_SCROLLOCK = 1073741895
    K_SEMICOLON = 59
    K_SLASH = 47
    K_SPACE = 32
    K_SYSREQ = 1073741978
    K_TAB = 9
    K_UNDERSCORE = 95
    K_UNKNOWN = 0
    K_UP = 1073741906
    K_a = 97
    K_b = 98
    K_c = 99
    K_d = 100
    K_e = 101
    K_f = 102
    K_g = 103
    K_h = 104
    K_i = 105
    K_j = 106
    K_k = 107
    K_l = 108
    K_m = 109
    K_n = 110
    K_o = 111
    K_p = 112
    K_q = 113
    K_r = 114
    K_s = 115
    K_t = 116
    K_u = 117
    K_v = 118
    K_w = 119
    K_x = 120
    K_y = 121
    K_z = 122
    LIL_ENDIAN = 1234
    MIDIIN = 32771
    MIDIOUT = 32772
    MOUSEBUTTONDOWN = 1025
    MOUSEBUTTONUP = 1026
    MOUSEMOTION = 1024
    MOUSEWHEEL = 1027
    MULTIGESTURE = 2050
    NOEVENT = 0
    NOFRAME = 32
    NUMEVENTS = 65535
    OPENGL = 2
    OPENGLBLIT = 10
    PREALLOC = 16777216
    QUIT = 256
    RESIZABLE = 16
    RLEACCEL = 16384
    RLEACCELOK = 8192
    SCALED = 512
    SCRAP_BMP = 'image/bmp'
    SCRAP_CLIPBOARD = 0
    SCRAP_PBM = 'image/pbm'
    SCRAP_PPM = 'image/ppm'
    SCRAP_SELECTION = 1
    SCRAP_TEXT = 'text/plain'
    SDL = SDLVersion(major=2, minor=0, patch=14)
    SHOWN = 64
    SRCALPHA = 65536
    SRCCOLORKEY = 4096
    SWSURFACE = 0
    SYSTEM_CURSOR_ARROW = 0
    SYSTEM_CURSOR_CROSSHAIR = 3
    SYSTEM_CURSOR_HAND = 11
    SYSTEM_CURSOR_IBEAM = 1
    SYSTEM_CURSOR_NO = 10
    SYSTEM_CURSOR_SIZEALL = 9
    SYSTEM_CURSOR_SIZENESW = 6
    SYSTEM_CURSOR_SIZENS = 8
    SYSTEM_CURSOR_SIZENWSE = 5
    SYSTEM_CURSOR_SIZEWE = 7
    SYSTEM_CURSOR_WAIT = 2
    SYSTEM_CURSOR_WAITARROW = 4
    SYSWMEVENT = 513
    TEXTEDITING = 770
    TEXTINPUT = 771
    TIMER_RESOLUTION = 0
    USEREVENT = 32847
    USEREVENT_DROPFILE = 4096
    VIDEOEXPOSE = 32770
    VIDEORESIZE = 32769
    WINDOWCLOSE = 32787
    WINDOWENTER = 32783
    WINDOWEXPOSED = 32776
    WINDOWFOCUSGAINED = 32785
    WINDOWFOCUSLOST = 32786
    WINDOWHIDDEN = 32775
    WINDOWHITTEST = 32789
    WINDOWLEAVE = 32784
    WINDOWMAXIMIZED = 32781
    WINDOWMINIMIZED = 32780
    WINDOWMOVED = 32777
    WINDOWRESIZED = 32778
    WINDOWRESTORED = 32782
    WINDOWSHOWN = 32774
    WINDOWSIZECHANGED = 32779
    WINDOWTAKEFOCUS = 32788
    movie = <pygame.MissingModule object>
    pygame_dir = r'C:\Python\Python38-32\lib\site-packages\pygame'
    rev = ''
    ver = '2.0.1'
    vernum = PygameVersion(major=2, minor=0, patch=1)

VERSION
    2.0.1

FILE
    c:\python\python38-32\lib\site-packages\pygame\__init__.py

