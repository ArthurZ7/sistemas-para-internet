import React from "react";

function Box({texto}) {
    return (
        <div className="box">
            {/* <img src="" alt="" /> */}
            <p>{texto}</p>
        </div>
    );
}

export default Box;