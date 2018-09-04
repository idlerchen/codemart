'use strict';

var containerHtml = '\n    <div class="cm-contact-us-container">\n        <div class="cm-contact-us-content">\n            <div class="cm-button-container">\n                <div class="cm-button" id="cm-contact-button">\n                    <img src="https://dn-coding-net-production-pp.qbox.me/3a626db2-c155-49f8-80a6-221ed55e26a3.png"/>\n                    联系我们\n                </div> \n            </div>\n            <div class="cm-pop-container animated cm-bounce-in-up" id="cm-contact-pop" data-show="false">\n                <div class="cm-title">在线咨询请添加客服 QQ</div>\n                <div class="cm-qr">\n                    <img src="https://dn-coding-net-production-pp.qbox.me/45f36272-79be-44ce-916b-16c40e91ace3.png"/>\n                </div>\n            </div>\n        </div>\n    </div>\n';

var css = '\n    @keyframes cmBounceInUp {\n        from,\n        60%,\n        75%,\n        90%,\n        to {\n            animation-timing-function: cubic-bezier(0.215, 0.61, 0.355, 1);\n        }\n    \n        from {\n        opacity: 0;\n            transform: translate3d(0, 10px, 0);\n        }\n    \n        60% {\n        opacity: 1;\n            transform: translate3d(0, -5px, 0);\n        }\n    \n        75% {\n            transform: translate3d(0, 5px, 0);\n        }\n    \n        90% {\n            transform: translate3d(0, -2px, 0);\n        }\n    \n        to {\n            transform: translate3d(0, 0, 0);\n        }\n    }\n  \n    .cm-bounce-in-up {\n        animation-name: cmBounceInUp;\n    }\n\n    .animated {\n        animation-duration: 1s;\n        animation-fill-mode: both;\n    }\n\n    .cm-contact-us-container{\n        position:fixed;\n        right: 50px;\n        bottom: 50px;\n    }\n\n    .cm-contact-us-container .cm-contact-us-content{\n        position:relative;\n    }\n\n    .cm-contact-us-container .cm-button-container .cm-button{\n        font-size: 14px;\n        padding: 0 14px;\n        line-height: 40px;\n        text-align: center;\n        border-radius: 100px;\n        color: #FFFFFF;\n        background: #0069C4;\n        border: 1px solid rgba(0,0,0,.05);\n        text-shadow: 0 1px 2px rgba(0,0,0,.15);\n        cursor:pointer;\n        transform-origin: center bottom;\n        transition: all .2s ease-out;\n    }\n\n    .cm-contact-us-container .cm-button-container .cm-button:hover{\n        transform: scale(1.05);\n    }\n\n    .cm-contact-us-container .cm-button-container .cm-button img{\n        height:20px;\n        display: inline-block;\n        vertical-align: middle;\n        margin-right: 5px;\n    }\n\n    .cm-pop-container{\n        border-radius: 4px;\n        background: #FFF;\n        position: absolute;\n        width: 168px;\n        height: 190px;\n        top: -205px;\n        left: 50%;\n        margin-left: -84px;\n        box-shadow:0 3px 10px rgba(0, 0, 0, 0.15);\n        display:none;\n    }\n\n    .cm-pop-container:before{\n        content: \' \';\n        position: absolute;\n        bottom: -5px;\n        left: 50%;\n        width: 10px;\n        height: 10px;\n        border: 1px solid #d8dde4;\n        border-right-color: transparent;\n        border-bottom-color: transparent;\n        transform: rotate(-135deg);\n        background: #fff;\n        z-index: 1;\n        margin-left: -6px;\n        border-radius: 2px;\n    }\n\n    .cm-pop-container .cm-title{\n        color:#2a465e;\n        font-size:12px;\n        line-height:17px;\n        padding:10px 0;\n        margin:0 14px;\n        border-bottom:.5px solid #d8dde4;\n        text-align:center;\n    }\n\n    .cm-pop-container .cm-qr{\n        padding:7px;\n    }\n\n    .cm-pop-container .cm-qr img{\n        width:100%;\n    }\n';

var pop = function pop() {
    var body = document.getElementsByTagName('body');
    var container = document.createElement('div');
    var style = document.createElement('style');

    document.body.appendChild(container);

    document.head.appendChild(style);

    container.innerHTML = containerHtml;
    style.innerHTML = css;

    var button = document.getElementById('cm-contact-button');
    var pop = document.getElementById('cm-contact-pop');

    button.addEventListener('click', function (e) {
        var show = pop.getAttribute("data-show");
        if (show === 'false') {
            pop.style.display = 'inherit';
            pop.setAttribute('data-show', 'true');
        } else {
            pop.style.display = 'none';
            pop.setAttribute('data-show', 'false');
        }
        e.stopPropagation();
        e.preventDefault();
    });

    window.addEventListener('click', function () {
        var targetElement = pop;
        var isInside = targetElement.contains(event.target) || targetElement === event.target;

        if (!isInside) {
            pop.style.display = 'none';
            pop.setAttribute('data-show', 'false');
        }
    }, false);
};

pop();
