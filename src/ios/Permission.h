//
//  Permission.h
//  Matthew
//
//  Created by Christopher Sullivan on 20180115.
//

#import <Cordova/CDVPlugin.h>


@interface Permission : CDVPlugin < UINavigationControllerDelegate, UIScrollViewDelegate>

@property (copy)   NSString* callbackId;

- (void) hasReadPermission:(CDVInvokedUrlCommand *)command;
- (void) requestReadPermission:(CDVInvokedUrlCommand *)command;


@end
