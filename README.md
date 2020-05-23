# mfshell

to install the application manually with helm: 
helm repo update
helm upgrade -i --cleanup-on-fail mfshell local/mfshell --set stage=prod --devel

or install the complete bundle see repo mfbundle