# RM Android

[![](https://jitpack.io/v/RevenueMonster/RM-Android.svg)](https://jitpack.io/#RevenueMonster/RM-Android)


<!-- For more details check out the [documentation]() -->

Add it to your build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and:

```gradle
dependencies {
    compile 'com.github.RevenueMonster:RM-Android:{latest version}'
}
```
<br/>
<br/>

### Checkout Sample Code
```java
try {
	new Checkout(getApplication()).getInstance().
	setWeChatAppID("<< WeChat Open Platform AppID >>").setEnv(Env.Sandbox).
	pay(Method.WECHATPAY_MY, "<<Get Checkout Code from API>>", MainActivity.this);
} catch(Exception e) {
	e.printStackTrace();
}

// Callback Result
static public class Result implements PaymentResult {
	public void onPaymentSuccess(Transaction transaction) {
		Log.d("SUCCESS", transaction.getStatus());
	}
	public void onPaymentFailed(Error error) {
		Log.d("FAILED", error.getCode());
	}
	public void onPaymentCancelled() {
		Log.d("CANCELLED", "User cancelled payment");
	}
}
```
