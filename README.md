# ShoppingApp_1


A. Adding splash screen when the app is launched------>

    1.Create a Custom Theme with the splash screen as the background
    2.Set this theme in the manifestof the activity
    3.NOTE - check if the theme's parent is Appcompat or Simple theme

B. Adding Toolbar--->  

    1.Add the dependency.
    2.Select NoActionBar in the theme already applied in styles.XML(in this case theme.XML)
    3.Create a new XML file with Root element(android.support.v7.widget.Toolbar)
    
C. Adding options on Toolbaar --->

    1.load the images in imageAsset file
    2.define them in <item> in an xml menu file
    3.inflate the menu in onCreateOptionsMenu
    4.handle click events in onOptionsItemSelected    
          
                 
